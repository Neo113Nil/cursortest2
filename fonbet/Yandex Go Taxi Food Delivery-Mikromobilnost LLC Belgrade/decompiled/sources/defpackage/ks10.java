package defpackage;

import com.squareup.moshi.Moshi;
import com.yandex.messaging.core.net.entities.directives.Button;
import com.yandex.messaging.core.net.entities.directives.Directive;
import com.yandex.messaging.core.net.entities.directives.DirectiveAdapter;
import com.yandex.messaging.core.net.entities.directives.OpenUriDirective;
import com.yandex.messaging.core.net.entities.directives.SendMessageDirective;
import com.yandex.messaging.core.net.entities.proto.ChatHistoryResponse;
import com.yandex.messaging.core.net.entities.proto.ChatInfoFromTransport;
import com.yandex.messaging.core.net.entities.proto.NotificationMeta;
import com.yandex.messaging.core.net.entities.proto.message.AiBotAction;
import com.yandex.messaging.core.net.entities.proto.message.AiBotActions;
import com.yandex.messaging.core.net.entities.proto.message.AiBotDirective;
import com.yandex.messaging.core.net.entities.proto.message.BotRequest;
import com.yandex.messaging.core.net.entities.proto.message.ChatCreatedInfo;
import com.yandex.messaging.core.net.entities.proto.message.ClientMessage;
import com.yandex.messaging.core.net.entities.proto.message.CustomPayload;
import com.yandex.messaging.core.net.entities.proto.message.ForwardedMessageInfo;
import com.yandex.messaging.core.net.entities.proto.message.ForwardedMessageStyle;
import com.yandex.messaging.core.net.entities.proto.message.LayoutSuggestButtons;
import com.yandex.messaging.core.net.entities.proto.message.MeetingStartedMessage;
import com.yandex.messaging.core.net.entities.proto.message.ParticipantsChange;
import com.yandex.messaging.core.net.entities.proto.message.PlainMessage;
import com.yandex.messaging.core.net.entities.proto.message.ReducedUserInfo;
import com.yandex.messaging.core.net.entities.proto.message.ServerMessage;
import com.yandex.messaging.core.net.entities.proto.message.ServerMessageInfo;
import com.yandex.messaging.core.net.entities.proto.message.SuggestButton;
import com.yandex.messaging.core.net.entities.proto.message.SuggestButtons;
import com.yandex.messaging.core.net.entities.proto.message.Suggests;
import com.yandex.messaging.core.net.entities.proto.message.SystemGenericMessage;
import com.yandex.messaging.core.net.entities.proto.message.SystemMessage;
import com.yandex.messaging.internal.entities.AiBotAction;
import com.yandex.messaging.internal.entities.ChatNamespaces;
import com.yandex.messaging.internal.entities.DivMessageData;
import com.yandex.messaging.internal.entities.EmptyMessageData;
import com.yandex.messaging.internal.entities.FileMessageData;
import com.yandex.messaging.internal.entities.GalleryMessageData;
import com.yandex.messaging.internal.entities.ImageMessageData;
import com.yandex.messaging.internal.entities.Message;
import com.yandex.messaging.internal.entities.MessageData;
import com.yandex.messaging.internal.entities.MessageReactions;
import com.yandex.messaging.internal.entities.ModeratedOutMessageData;
import com.yandex.messaging.internal.entities.PollMessageData;
import com.yandex.messaging.internal.entities.RemovedMessageData;
import com.yandex.messaging.internal.entities.StickerMessageData;
import com.yandex.messaging.internal.entities.Suggest;
import com.yandex.messaging.internal.entities.TechBaseMessage;
import com.yandex.messaging.internal.entities.TechCallInfoMessage;
import com.yandex.messaging.internal.entities.TechChatAvatarChangedMessage;
import com.yandex.messaging.internal.entities.TechChatCreatedMessage;
import com.yandex.messaging.internal.entities.TechChatInfoChangedMessage;
import com.yandex.messaging.internal.entities.TechGenericMessage;
import com.yandex.messaging.internal.entities.TechMeetingEndedMessage;
import com.yandex.messaging.internal.entities.TechMeetingStartedMessage;
import com.yandex.messaging.internal.entities.TechUnknownMessage;
import com.yandex.messaging.internal.entities.TechUserJoinChatByLinkMessage;
import com.yandex.messaging.internal.entities.TechUserJoinChatMessage;
import com.yandex.messaging.internal.entities.TechUserLeaveChatMessage;
import com.yandex.messaging.internal.entities.TechUsersAddedToChatMessage;
import com.yandex.messaging.internal.entities.TechUsersRemovedFromChatMessage;
import com.yandex.messaging.internal.entities.TextMessageData;
import com.yandex.messaging.internal.entities.UnsupportedMessageData;
import com.yandex.messaging.internal.entities.VideoMessageData;
import com.yandex.messaging.internal.entities.VoiceMessageData;
import com.yandex.messaging.telemost.domain.entities.TechPersonalMeetingEndedMessage;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Result;
import kotlin.collections.EmptyList;
import kotlin.collections.a;
import kotlin.sequences.b;

/* loaded from: classes15.dex */
public final class ks10 {
    public final lqo a;
    public final vw10 b;
    public final sm1 c;
    public final DirectiveAdapter d;

    public ks10(lqo lqoVar, vw10 vw10Var, sm1 sm1Var, Moshi moshi) {
        this.a = lqoVar;
        this.b = vw10Var;
        this.c = sm1Var;
        this.d = (DirectiveAdapter) moshi.adapter(Directive.class);
    }

    public static /* synthetic */ Message f(ks10 ks10Var, ServerMessageInfo serverMessageInfo, SystemMessage systemMessage, boolean z, int i, NotificationMeta notificationMeta, boolean z2, boolean z3, int i2) {
        return ks10Var.e(serverMessageInfo, systemMessage, z, i, notificationMeta, z2, (i2 & 128) != 0 ? false : z3);
    }

    public final Directive a(AiBotDirective aiBotDirective, ArrayList arrayList, tls tlsVar) {
        Object failure;
        try {
            failure = this.d.b(aiBotDirective.getType(), aiBotDirective.getName(), aiBotDirective.getPayload());
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        Throwable a = Result.a(failure);
        if (a != null) {
            tlsVar.invoke(a);
            arrayList.add(new BotRequest.Error(null, new BotRequest.Error.InvalidDirectivePayload(aiBotDirective.getName()), null, 5, null));
            failure = null;
        }
        return (Directive) failure;
    }

    public final Message b(ServerMessage serverMessage) {
        ClientMessage clientMessage = serverMessage.clientMessage;
        PlainMessage plainMessage = clientMessage.plain;
        PlainMessage plainMessage2 = plainMessage == null ? clientMessage.ephemeral : plainMessage;
        SystemMessage systemMessage = clientMessage.systemMessage;
        if (plainMessage2 != null) {
            return c(serverMessage, plainMessage2, plainMessage == null);
        }
        if (systemMessage == null) {
            return null;
        }
        return f(this, serverMessage.serverMessageInfo, systemMessage, clientMessage.isSilent, clientMessage.notificationBehaviour, serverMessage.notificationMeta, false, clientMessage.withPersistentInlineButtons, 64);
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x00c2, code lost:
    
        if (r14 != null) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x000d, code lost:
    
        if (r0.isEmpty() == false) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Message c(ServerMessage serverMessage, PlainMessage plainMessage, boolean z) {
        List<ForwardedMessageInfo> list;
        Message[] messageArr;
        ReducedUserInfo[] reducedUserInfoArr;
        Collection collection;
        ForwardedMessageStyle forwardedMessageStyle;
        ForwardedMessageInfo[] forwardedMessageInfoArr = serverMessage.forwardedMessages;
        if (forwardedMessageInfoArr != null) {
            list = j73.A(forwardedMessageInfoArr);
        }
        list = null;
        ServerMessageInfo serverMessageInfo = serverMessage.serverMessageInfo;
        boolean z2 = list == null || list.isEmpty();
        ClientMessage clientMessage = serverMessage.clientMessage;
        Message d = d(serverMessageInfo, plainMessage, !z2, clientMessage.isSilent, clientMessage.notificationBehaviour, serverMessage.notificationMeta, z, clientMessage.withPersistentInlineButtons);
        MessageData messageData = d.h;
        messageData.reactionsVersion = serverMessage.reactionsVersion;
        messageData.reactions = MessageReactions.a(serverMessage.reactions, serverMessage.recentUserReactions);
        if (list != null) {
            ArrayList arrayList = new ArrayList(tcc.n(list, 10));
            for (ForwardedMessageInfo forwardedMessageInfo : list) {
                ServerMessageInfo serverMessageInfo2 = forwardedMessageInfo.serverMessageInfo;
                PlainMessage plainMessage2 = forwardedMessageInfo.plain;
                ClientMessage clientMessage2 = serverMessage.clientMessage;
                arrayList.add(d(serverMessageInfo2, plainMessage2, false, clientMessage2.isSilent, clientMessage2.notificationBehaviour, serverMessage.notificationMeta, false, false));
            }
            messageArr = (Message[]) a.q0(arrayList).toArray(new Message[0]);
        } else {
            messageArr = null;
        }
        d.l = messageArr;
        ForwardedMessageStyle[] forwardedMessageStyles = plainMessage.getForwardedMessageStyles();
        d.m = (forwardedMessageStyles == null || (forwardedMessageStyle = (ForwardedMessageStyle) j73.D(forwardedMessageStyles)) == null) ? null : forwardedMessageStyle.getQuote();
        Message[] messageArr2 = d.l;
        if (messageArr2 != null) {
            ArrayList arrayList2 = new ArrayList();
            for (Message message : messageArr2) {
                ReducedUserInfo reducedUserInfo = message.n;
                if (reducedUserInfo != null) {
                    arrayList2.add(reducedUserInfo);
                }
            }
            reducedUserInfoArr = (ReducedUserInfo[]) arrayList2.toArray(new ReducedUserInfo[0]);
        }
        reducedUserInfoArr = new ReducedUserInfo[0];
        ReducedUserInfo[] reducedUserInfoArr2 = serverMessage.mentionedUsers;
        ReducedUserInfo[] reducedUserInfoArr3 = reducedUserInfoArr2 != null ? (ReducedUserInfo[]) j73.A(reducedUserInfoArr2).toArray(new ReducedUserInfo[0]) : null;
        ReducedUserInfo[] reducedUserInfoArr4 = serverMessage.users;
        c2k c2kVar = new c2k(new s5r(b.k(b.i(j73.v(new ReducedUserInfo[][]{reducedUserInfoArr4 != null ? (ReducedUserInfo[]) j73.A(reducedUserInfoArr4).toArray(new ReducedUserInfo[0]) : null, reducedUserInfoArr3, reducedUserInfoArr, new ReducedUserInfo[]{serverMessage.serverMessageInfo.from}})), new ws00(28))), new ws00(29));
        if (c2kVar.hasNext()) {
            Object next = c2kVar.next();
            if (c2kVar.hasNext()) {
                ArrayList arrayList3 = new ArrayList();
                arrayList3.add(next);
                while (c2kVar.hasNext()) {
                    arrayList3.add(c2kVar.next());
                }
                collection = arrayList3;
            } else {
                collection = Collections.singletonList(next);
            }
        } else {
            collection = EmptyList.a;
        }
        d.r = (ReducedUserInfo[]) collection.toArray(new ReducedUserInfo[0]);
        d.q = this.b.b(serverMessage);
        return d;
    }

    /* JADX WARN: Code restructure failed: missing block: B:66:0x03ce, code lost:
    
        if (r3 == null) goto L158;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0440  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x034f  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x034c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0356  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x03a3  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0449  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x045f  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0473  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0462  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x03d2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Message d(ServerMessageInfo serverMessageInfo, PlainMessage plainMessage, boolean z, boolean z2, int i, NotificationMeta notificationMeta, boolean z3, boolean z4) {
        String str;
        MessageData voiceMessageData;
        MessageData messageData;
        int[] iArr;
        TextMessageData textMessageData;
        String text;
        AiBotActions aiBotActionsHolder;
        ArrayList arrayList;
        Button[] buttonArr;
        Suggests suggestsHolder;
        ArrayList arrayList2;
        Suggests suggestsHolder2;
        ArrayList arrayList3;
        SuggestButton[] buttons;
        LayoutSuggestButtons layoutSuggestButtons;
        SuggestButtons[] rows;
        ArrayList arrayList4;
        AiBotAction[] aiBotActions;
        List list;
        PlainMessage.Text text2 = plainMessage.getText();
        int i2 = 0;
        if (serverMessageInfo.moderationAction == 2) {
            messageData = new ModeratedOutMessageData();
        } else {
            if (!serverMessageInfo.deleted) {
                str = "";
                if (plainMessage.getCard() == null) {
                    if (plainMessage.getPoll() != null) {
                        PlainMessage.Poll poll = plainMessage.getPoll();
                        String[] strArr = poll.answers;
                        int length = strArr.length;
                        String[] strArr2 = new String[length];
                        System.arraycopy(strArr, 0, strArr2, 0, length);
                        PollMessageData.VoteResult voteResult = new PollMessageData.VoteResult();
                        PlainMessage.PollResult pollResult = poll.pollResults;
                        if (pollResult != null) {
                            voteResult.version = pollResult.version;
                            voteResult.voteCount = pollResult.voteCount;
                            int[] iArr2 = pollResult.answers;
                            if (iArr2 != null) {
                                int length2 = iArr2.length;
                                int[] iArr3 = new int[length2];
                                voteResult.answers = iArr3;
                                System.arraycopy(iArr2, 0, iArr3, 0, length2);
                            }
                            ReducedUserInfo[] reducedUserInfoArr = pollResult.recentVoters;
                            if (reducedUserInfoArr != null) {
                                int length3 = reducedUserInfoArr.length;
                                ReducedUserInfo[] reducedUserInfoArr2 = new ReducedUserInfo[length3];
                                voteResult.voters = reducedUserInfoArr2;
                                System.arraycopy(reducedUserInfoArr, 0, reducedUserInfoArr2, 0, length3);
                                if (length3 != pollResult.voteCount) {
                                    ydz.b("PollMessageData", "Inconsistent data, voters count is " + pollResult.voteCount + " but has voters length ");
                                }
                            } else {
                                ydz.b("PollMessageData", "Inconsistent data, voters count is " + pollResult.voteCount + " but has no info about recent voters ");
                            }
                        }
                        int[] iArr4 = poll.myChoices;
                        if (iArr4 != null) {
                            int[] iArr5 = new int[iArr4.length];
                            System.arraycopy(iArr4, 0, iArr5, 0, iArr4.length);
                            iArr = iArr5;
                        } else {
                            iArr = null;
                        }
                        voiceMessageData = new PollMessageData(poll.title, strArr2, poll.isAnonymous, poll.maxChoices != 1, voteResult, iArr);
                    } else if (plainMessage.getImage() != null) {
                        PlainMessage.Image image = plainMessage.getImage();
                        ImageMessageData imageMessageData = new ImageMessageData(1, "");
                        imageMessageData.height = Integer.valueOf(image.height);
                        imageMessageData.width = Integer.valueOf(image.width);
                        PlainMessage.FileInfo fileInfo = image.fileInfo;
                        imageMessageData.fileId = fileInfo.id2;
                        imageMessageData.animated = image.animated;
                        imageMessageData.imageSize = Long.valueOf(fileInfo.size);
                        if (imageMessageData.fileId == null) {
                            imageMessageData.fileId = String.valueOf(image.fileInfo.id);
                        }
                        PlainMessage.FileInfo fileInfo2 = image.fileInfo;
                        imageMessageData.fileName = fileInfo2.name;
                        imageMessageData.fileSource = fileInfo2.source;
                        textMessageData = imageMessageData;
                    } else if (plainMessage.getFile() != null) {
                        PlainMessage.File file = plainMessage.getFile();
                        PlainMessage.File.PreviewHint previewHint = this.a.a(tz10.W) ? new PlainMessage.File.PreviewHint(new PlainMessage.File.VideoPreview(0, 0, 0L, null, 15, null)) : file.getPreviewHint();
                        PlainMessage.File.VideoPreview videoPreview = previewHint != null ? previewHint.getVideoPreview() : null;
                        if (videoPreview != null) {
                            String str2 = file.getFileInfo().name;
                            VideoMessageData videoMessageData = new VideoMessageData(file.getFileInfo().size, videoPreview.blurHash, videoPreview.width, videoPreview.durationMs, str2 == null ? "" : str2, videoPreview.height);
                            String str3 = file.getFileInfo().id2;
                            videoMessageData.fileId = str3;
                            if (str3 == null) {
                                videoMessageData.fileId = String.valueOf(file.getFileInfo().id);
                            }
                            videoMessageData.fileSource = file.getFileInfo().source;
                            messageData = videoMessageData;
                        } else {
                            FileMessageData fileMessageData = new FileMessageData("", file.getFileInfo().size);
                            String str4 = file.getFileInfo().id2;
                            fileMessageData.fileId = str4;
                            if (str4 == null) {
                                fileMessageData.fileId = String.valueOf(file.getFileInfo().id);
                            }
                            fileMessageData.fileName = file.getFileInfo().name;
                            fileMessageData.fileSource = file.getFileInfo().source;
                            messageData = fileMessageData;
                        }
                    } else if (plainMessage.getSticker() != null) {
                        messageData = new StickerMessageData(plainMessage.getSticker().getId(), plainMessage.getSticker().getSetId());
                    } else if (plainMessage.getVoice() != null) {
                        PlainMessage.Voice voice = plainMessage.getVoice();
                        PlainMessage.FileInfo fileInfo3 = voice.fileInfo;
                        String str5 = fileInfo3.name;
                        voiceMessageData = new VoiceMessageData(str5 == null ? "" : str5, fileInfo3.id2, voice.duration, voice.text, voice.wasRecognized, voice.waveform, voice.disableRecognition);
                    } else if (text2 != null) {
                        if (text2.getCard() != null) {
                            String text3 = text2.getText();
                            DivMessageData divMessageData = new DivMessageData(text3 != null ? text3 : "");
                            divMessageData.card = text2.getCard().getCard();
                            textMessageData = divMessageData;
                        } else {
                            String text4 = text2.getText();
                            textMessageData = new TextMessageData(0, text4 != null ? text4 : "");
                        }
                    } else if (plainMessage.getGallery() != null) {
                        GalleryMessageData galleryMessageData = new GalleryMessageData();
                        PlainMessage.Item[] items = plainMessage.getGallery().getItems();
                        galleryMessageData.items = items;
                        galleryMessageData.text = plainMessage.getGallery().getText();
                        messageData = galleryMessageData;
                        if (items.length != 0) {
                            PlainMessage.FileInfo fileInfo4 = galleryMessageData.items[0].image.fileInfo;
                            String str6 = fileInfo4.id2;
                            galleryMessageData.previewId = str6;
                            messageData = galleryMessageData;
                            if (str6 == null) {
                                galleryMessageData.previewId = String.valueOf(fileInfo4.id);
                                messageData = galleryMessageData;
                            }
                        }
                    } else {
                        messageData = z ? new EmptyMessageData() : new UnsupportedMessageData();
                    }
                    voiceMessageData.urlPreviewDisabled = Boolean.valueOf(plainMessage.getUrlPreviewDisabled());
                    voiceMessageData.notificationText = plainMessage.getNotificationText();
                    voiceMessageData.lastEditTimestamp = serverMessageInfo.lastEditTimestamp;
                    voiceMessageData.payloadId = plainMessage.getPayloadId();
                    voiceMessageData.isSilent = z2;
                    voiceMessageData.notificationBehaviour = i;
                    aiBotActionsHolder = plainMessage.getAiBotActionsHolder();
                    if (aiBotActionsHolder != null || (aiBotActions = aiBotActionsHolder.getAiBotActions()) == null) {
                        arrayList = null;
                    } else {
                        arrayList = new ArrayList(aiBotActions.length);
                        int length4 = aiBotActions.length;
                        int i3 = 0;
                        while (i3 < length4) {
                            AiBotAction aiBotAction = aiBotActions[i3];
                            ArrayList arrayList5 = new ArrayList();
                            String title = aiBotAction.getTitle();
                            AiBotAction.Icon icon = new AiBotAction.Icon(aiBotAction.getIcon().getType(), aiBotAction.getIcon().getValue());
                            AiBotDirective[] directives = aiBotAction.getDirectives();
                            if (directives != null) {
                                ArrayList arrayList6 = new ArrayList();
                                int length5 = directives.length;
                                int i4 = i2;
                                ArrayList arrayList7 = arrayList6;
                                while (i4 < length5) {
                                    ArrayList arrayList8 = arrayList7;
                                    AiBotDirective aiBotDirective = directives[i4];
                                    AiBotDirective[] aiBotDirectiveArr = directives;
                                    int i5 = i4;
                                    int i6 = length5;
                                    Directive a = a(aiBotDirective, arrayList5, new vqy(this, aiBotAction, aiBotDirective, plainMessage, 5));
                                    if (a != null) {
                                        arrayList8.add(a);
                                    }
                                    i4 = i5 + 1;
                                    arrayList7 = arrayList8;
                                    length5 = i6;
                                    directives = aiBotDirectiveArr;
                                }
                                list = arrayList7;
                            } else {
                                list = EmptyList.a;
                            }
                            arrayList.add(new com.yandex.messaging.internal.entities.AiBotAction(title, icon, list, !arrayList5.isEmpty() ? arrayList5 : null, aiBotAction.getButtonId()));
                            i3++;
                            i2 = 0;
                        }
                    }
                    voiceMessageData.aiBotActions = arrayList;
                    CustomPayload customPayload = plainMessage.getCustomPayload();
                    buttonArr = customPayload != null ? customPayload.suggests : null;
                    suggestsHolder = plainMessage.getSuggestsHolder();
                    if (suggestsHolder != null || (layoutSuggestButtons = suggestsHolder.getLayoutSuggestButtons()) == null || (rows = layoutSuggestButtons.getRows()) == null) {
                        arrayList2 = null;
                    } else {
                        arrayList2 = new ArrayList();
                        for (SuggestButtons suggestButtons : rows) {
                            SuggestButton[] buttons2 = suggestButtons.getButtons();
                            if (buttons2 != null) {
                                arrayList4 = new ArrayList(buttons2.length);
                                for (SuggestButton suggestButton : buttons2) {
                                    arrayList4.add(h(suggestButton, plainMessage.getPayloadId(), plainMessage.getChatId()));
                                }
                            } else {
                                arrayList4 = null;
                            }
                            if (arrayList4 != null) {
                                arrayList2.add(arrayList4);
                            }
                        }
                    }
                    voiceMessageData.layoutSuggestsRows = arrayList2;
                    suggestsHolder2 = plainMessage.getSuggestsHolder();
                    if (suggestsHolder2 != null) {
                        SuggestButtons suggestButtons2 = suggestsHolder2.getSuggestButtons();
                        if (suggestButtons2 == null || (buttons = suggestButtons2.getButtons()) == null) {
                            arrayList3 = null;
                        } else {
                            arrayList3 = new ArrayList(buttons.length);
                            for (SuggestButton suggestButton2 : buttons) {
                                arrayList3.add(h(suggestButton2, plainMessage.getPayloadId(), plainMessage.getChatId()));
                            }
                        }
                    }
                    if (buttonArr != null) {
                        arrayList3 = new ArrayList(buttonArr.length);
                        for (Button button : buttonArr) {
                            plainMessage.getPayloadId();
                            plainMessage.getChatId();
                            ArrayList arrayList9 = new ArrayList();
                            Directive[] directiveArr = button.directives;
                            if (directiveArr != null) {
                                ycc.t(arrayList9, directiveArr);
                            }
                            String str7 = button.url;
                            if (str7 != null) {
                                OpenUriDirective openUriDirective = new OpenUriDirective();
                                openUriDirective.uri = str7;
                                arrayList9.add(openUriDirective);
                            } else {
                                SendMessageDirective sendMessageDirective = new SendMessageDirective();
                                String str8 = button.text;
                                if (str8 == null) {
                                    str8 = button.title;
                                }
                                sendMessageDirective.text = str8;
                                Object obj = button.payload;
                                Map map = obj instanceof Map ? (Map) obj : null;
                                Object obj2 = map != null ? map.get("callback_data") : null;
                                sendMessageDirective.callbackData = obj2 instanceof Map ? (Map) obj2 : null;
                                arrayList9.add(sendMessageDirective);
                            }
                            arrayList3.add(new Suggest(button.title, arrayList9, null, null, 12, null));
                        }
                    } else {
                        arrayList3 = null;
                    }
                    voiceMessageData.regularSuggests = arrayList3;
                    Suggests suggestsHolder3 = plainMessage.getSuggestsHolder();
                    voiceMessageData.persistentSuggests = suggestsHolder3 != null ? Boolean.valueOf(suggestsHolder3.getPersist()) : null;
                    boolean b = ChatNamespaces.b(plainMessage.getChatId());
                    return new Message(plainMessage.getChatId(), serverMessageInfo.timestamp, serverMessageInfo.seqNo, serverMessageInfo.prevTimestamp, serverMessageInfo.historyVersion, plainMessage.getPayloadId(), serverMessageInfo.from.userId, voiceMessageData, plainMessage.getCustomPayload(), serverMessageInfo.lastEditTimestamp, serverMessageInfo.version, serverMessageInfo.from, serverMessageInfo.customFrom, serverMessageInfo.moderationAction, !b ? 0L : Math.max(1L, serverMessageInfo.views), b ? serverMessageInfo.forwardCount : 0L, notificationMeta, plainMessage.isStarred(), serverMessageInfo.threadState, z3, z4);
                }
                if (text2 != null && (text = text2.getText()) != null) {
                    str = text;
                }
                DivMessageData divMessageData2 = new DivMessageData(str);
                divMessageData2.card = plainMessage.getCard().getCard();
                textMessageData = divMessageData2;
                voiceMessageData = textMessageData;
                voiceMessageData.urlPreviewDisabled = Boolean.valueOf(plainMessage.getUrlPreviewDisabled());
                voiceMessageData.notificationText = plainMessage.getNotificationText();
                voiceMessageData.lastEditTimestamp = serverMessageInfo.lastEditTimestamp;
                voiceMessageData.payloadId = plainMessage.getPayloadId();
                voiceMessageData.isSilent = z2;
                voiceMessageData.notificationBehaviour = i;
                aiBotActionsHolder = plainMessage.getAiBotActionsHolder();
                if (aiBotActionsHolder != null) {
                }
                arrayList = null;
                voiceMessageData.aiBotActions = arrayList;
                CustomPayload customPayload2 = plainMessage.getCustomPayload();
                if (customPayload2 != null) {
                }
                suggestsHolder = plainMessage.getSuggestsHolder();
                if (suggestsHolder != null) {
                }
                arrayList2 = null;
                voiceMessageData.layoutSuggestsRows = arrayList2;
                suggestsHolder2 = plainMessage.getSuggestsHolder();
                if (suggestsHolder2 != null) {
                }
                if (buttonArr != null) {
                }
                voiceMessageData.regularSuggests = arrayList3;
                Suggests suggestsHolder32 = plainMessage.getSuggestsHolder();
                voiceMessageData.persistentSuggests = suggestsHolder32 != null ? Boolean.valueOf(suggestsHolder32.getPersist()) : null;
                boolean b2 = ChatNamespaces.b(plainMessage.getChatId());
                return new Message(plainMessage.getChatId(), serverMessageInfo.timestamp, serverMessageInfo.seqNo, serverMessageInfo.prevTimestamp, serverMessageInfo.historyVersion, plainMessage.getPayloadId(), serverMessageInfo.from.userId, voiceMessageData, plainMessage.getCustomPayload(), serverMessageInfo.lastEditTimestamp, serverMessageInfo.version, serverMessageInfo.from, serverMessageInfo.customFrom, serverMessageInfo.moderationAction, !b2 ? 0L : Math.max(1L, serverMessageInfo.views), b2 ? serverMessageInfo.forwardCount : 0L, notificationMeta, plainMessage.isStarred(), serverMessageInfo.threadState, z3, z4);
            }
            RemovedMessageData removedMessageData = new RemovedMessageData();
            removedMessageData.removedGroupSize = 1;
            messageData = removedMessageData;
        }
        voiceMessageData = messageData;
        voiceMessageData.urlPreviewDisabled = Boolean.valueOf(plainMessage.getUrlPreviewDisabled());
        voiceMessageData.notificationText = plainMessage.getNotificationText();
        voiceMessageData.lastEditTimestamp = serverMessageInfo.lastEditTimestamp;
        voiceMessageData.payloadId = plainMessage.getPayloadId();
        voiceMessageData.isSilent = z2;
        voiceMessageData.notificationBehaviour = i;
        aiBotActionsHolder = plainMessage.getAiBotActionsHolder();
        if (aiBotActionsHolder != null) {
        }
        arrayList = null;
        voiceMessageData.aiBotActions = arrayList;
        CustomPayload customPayload22 = plainMessage.getCustomPayload();
        if (customPayload22 != null) {
        }
        suggestsHolder = plainMessage.getSuggestsHolder();
        if (suggestsHolder != null) {
        }
        arrayList2 = null;
        voiceMessageData.layoutSuggestsRows = arrayList2;
        suggestsHolder2 = plainMessage.getSuggestsHolder();
        if (suggestsHolder2 != null) {
        }
        if (buttonArr != null) {
        }
        voiceMessageData.regularSuggests = arrayList3;
        Suggests suggestsHolder322 = plainMessage.getSuggestsHolder();
        voiceMessageData.persistentSuggests = suggestsHolder322 != null ? Boolean.valueOf(suggestsHolder322.getPersist()) : null;
        boolean b22 = ChatNamespaces.b(plainMessage.getChatId());
        return new Message(plainMessage.getChatId(), serverMessageInfo.timestamp, serverMessageInfo.seqNo, serverMessageInfo.prevTimestamp, serverMessageInfo.historyVersion, plainMessage.getPayloadId(), serverMessageInfo.from.userId, voiceMessageData, plainMessage.getCustomPayload(), serverMessageInfo.lastEditTimestamp, serverMessageInfo.version, serverMessageInfo.from, serverMessageInfo.customFrom, serverMessageInfo.moderationAction, !b22 ? 0L : Math.max(1L, serverMessageInfo.views), b22 ? serverMessageInfo.forwardCount : 0L, notificationMeta, plainMessage.isStarred(), serverMessageInfo.threadState, z3, z4);
    }

    /* JADX WARN: Code restructure failed: missing block: B:108:0x012f, code lost:
    
        if ((r3 != null ? r3.guestsGuids : null) != null) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x01b8, code lost:
    
        if ((r3 != null ? r3.guestsGuids : null) != null) goto L157;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x004b, code lost:
    
        if ((r3 != null ? r3.description : null) != null) goto L29;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v11, types: [com.yandex.messaging.telemost.domain.entities.TechPersonalMeetingEndedMessage] */
    /* JADX WARN: Type inference failed for: r1v13, types: [com.yandex.messaging.internal.entities.TechMeetingEndedMessage] */
    /* JADX WARN: Type inference failed for: r1v15, types: [com.yandex.messaging.internal.entities.TechMeetingStartedMessage] */
    /* JADX WARN: Type inference failed for: r1v16, types: [com.yandex.messaging.internal.entities.TechGenericMessage] */
    /* JADX WARN: Type inference failed for: r1v18, types: [com.yandex.messaging.internal.entities.TechCallInfoMessage] */
    /* JADX WARN: Type inference failed for: r1v20, types: [com.yandex.messaging.internal.entities.TechUserLeaveChatMessage] */
    /* JADX WARN: Type inference failed for: r1v22, types: [com.yandex.messaging.internal.entities.TechUserJoinChatByLinkMessage] */
    /* JADX WARN: Type inference failed for: r1v24, types: [com.yandex.messaging.internal.entities.TechUserJoinChatMessage] */
    /* JADX WARN: Type inference failed for: r2v1, types: [com.yandex.messaging.internal.entities.TechUsersRemovedFromChatMessage] */
    /* JADX WARN: Type inference failed for: r2v2, types: [com.yandex.messaging.internal.entities.TechUsersAddedToChatMessage] */
    /* JADX WARN: Type inference failed for: r2v3, types: [com.yandex.messaging.internal.entities.TechUsersRemovedFromChatMessage] */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v6, types: [com.yandex.messaging.internal.entities.TechUsersAddedToChatMessage] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Message e(ServerMessageInfo serverMessageInfo, SystemMessage systemMessage, boolean z, int i, NotificationMeta notificationMeta, boolean z2, boolean z3) {
        ?? techUsersRemovedFromChatMessage;
        ReducedUserInfo[] reducedUserInfoArr;
        TechBaseMessage techBaseMessage;
        ChatInfoFromTransport chatInfoFromTransport;
        ChatInfoFromTransport chatInfoFromTransport2;
        int i2 = 0;
        ReducedUserInfo[] reducedUserInfoArr2 = new ReducedUserInfo[0];
        ChatCreatedInfo chatCreatedInfo = systemMessage.getChatCreatedInfo();
        r4 = null;
        String str = null;
        String str2 = "yamb";
        if (((chatCreatedInfo == null || (chatInfoFromTransport2 = chatCreatedInfo.initialInfo) == null) ? null : chatInfoFromTransport2.name) != null) {
            TechChatCreatedMessage techChatCreatedMessage = new TechChatCreatedMessage();
            ChatCreatedInfo chatCreatedInfo2 = systemMessage.getChatCreatedInfo();
            if (chatCreatedInfo2 != null && (chatInfoFromTransport = chatCreatedInfo2.initialInfo) != null) {
                str = chatInfoFromTransport.name;
            }
            techChatCreatedMessage.name = str;
            techBaseMessage = techChatCreatedMessage;
        } else {
            if (systemMessage.getChatInfoDiff() != null) {
                ChatInfoFromTransport chatInfoDiff = systemMessage.getChatInfoDiff();
                if ((chatInfoDiff != null ? chatInfoDiff.name : null) == null) {
                    ChatInfoFromTransport chatInfoDiff2 = systemMessage.getChatInfoDiff();
                }
                TechChatInfoChangedMessage techChatInfoChangedMessage = new TechChatInfoChangedMessage();
                ChatInfoFromTransport chatInfoDiff3 = systemMessage.getChatInfoDiff();
                techChatInfoChangedMessage.name = chatInfoDiff3 != null ? chatInfoDiff3.name : null;
                ChatInfoFromTransport chatInfoDiff4 = systemMessage.getChatInfoDiff();
                techChatInfoChangedMessage.description = chatInfoDiff4 != null ? chatInfoDiff4.description : null;
                techBaseMessage = techChatInfoChangedMessage;
            }
            if (systemMessage.getChatInfoDiff() != null) {
                ChatInfoFromTransport chatInfoDiff5 = systemMessage.getChatInfoDiff();
                if ((chatInfoDiff5 != null ? chatInfoDiff5.avatarUrl : null) != null) {
                    techBaseMessage = new TechChatAvatarChangedMessage();
                }
            }
            ParticipantsChange usersChange = systemMessage.getUsersChange();
            if ((usersChange != null ? usersChange.addedUsers : null) != null) {
                techUsersRemovedFromChatMessage = new TechUsersAddedToChatMessage();
                ParticipantsChange usersChange2 = systemMessage.getUsersChange();
                reducedUserInfoArr = usersChange2 != null ? usersChange2.addedUsers : null;
                techUsersRemovedFromChatMessage.guids = new String[0];
                if (reducedUserInfoArr != null && reducedUserInfoArr.length > 0) {
                    techUsersRemovedFromChatMessage.guids = new String[reducedUserInfoArr.length];
                    int length = reducedUserInfoArr.length;
                    while (i2 < length) {
                        String[] strArr = techUsersRemovedFromChatMessage.guids;
                        ReducedUserInfo reducedUserInfo = reducedUserInfoArr[i2];
                        strArr[i2] = reducedUserInfo != null ? reducedUserInfo.userId : null;
                        i2++;
                    }
                }
            } else {
                ParticipantsChange usersChange3 = systemMessage.getUsersChange();
                if ((usersChange3 != null ? usersChange3.removedUsers : null) != null) {
                    techUsersRemovedFromChatMessage = new TechUsersRemovedFromChatMessage();
                    ParticipantsChange usersChange4 = systemMessage.getUsersChange();
                    reducedUserInfoArr = usersChange4 != null ? usersChange4.removedUsers : null;
                    techUsersRemovedFromChatMessage.guids = new String[0];
                    if (reducedUserInfoArr != null && reducedUserInfoArr.length > 0) {
                        techUsersRemovedFromChatMessage.guids = new String[reducedUserInfoArr.length];
                        int length2 = reducedUserInfoArr.length;
                        while (i2 < length2) {
                            String[] strArr2 = techUsersRemovedFromChatMessage.guids;
                            ReducedUserInfo reducedUserInfo2 = reducedUserInfoArr[i2];
                            strArr2[i2] = reducedUserInfo2 != null ? reducedUserInfo2.userId : null;
                            i2++;
                        }
                    }
                } else {
                    if (systemMessage.getParticipantsChange() != null) {
                        ParticipantsChange participantsChange = systemMessage.getParticipantsChange();
                        if ((participantsChange != null ? participantsChange.addedUsers : null) == null) {
                            ParticipantsChange participantsChange2 = systemMessage.getParticipantsChange();
                            if ((participantsChange2 != null ? participantsChange2.addedGroups : null) == null) {
                                ParticipantsChange participantsChange3 = systemMessage.getParticipantsChange();
                                if ((participantsChange3 != null ? participantsChange3.addedDepartments : null) == null) {
                                    ParticipantsChange participantsChange4 = systemMessage.getParticipantsChange();
                                }
                            }
                        }
                        techUsersRemovedFromChatMessage = new TechUsersAddedToChatMessage();
                        ParticipantsChange participantsChange5 = systemMessage.getParticipantsChange();
                        reducedUserInfoArr = participantsChange5 != null ? participantsChange5.addedUsers : null;
                        techUsersRemovedFromChatMessage.guids = new String[0];
                        if (reducedUserInfoArr != null && reducedUserInfoArr.length > 0) {
                            techUsersRemovedFromChatMessage.guids = new String[reducedUserInfoArr.length];
                            int length3 = reducedUserInfoArr.length;
                            while (i2 < length3) {
                                String[] strArr3 = techUsersRemovedFromChatMessage.guids;
                                ReducedUserInfo reducedUserInfo3 = reducedUserInfoArr[i2];
                                strArr3[i2] = reducedUserInfo3 != null ? reducedUserInfo3.userId : null;
                                i2++;
                            }
                        }
                        ParticipantsChange participantsChange6 = systemMessage.getParticipantsChange();
                        techUsersRemovedFromChatMessage.groups = participantsChange6 != null ? participantsChange6.addedGroups : null;
                        ParticipantsChange participantsChange7 = systemMessage.getParticipantsChange();
                        techUsersRemovedFromChatMessage.departments = participantsChange7 != null ? participantsChange7.addedDepartments : null;
                        ParticipantsChange participantsChange8 = systemMessage.getParticipantsChange();
                        techUsersRemovedFromChatMessage.guestsGuids = participantsChange8 != null ? participantsChange8.guestsGuids : null;
                    }
                    if (systemMessage.getParticipantsChange() != null) {
                        ParticipantsChange participantsChange9 = systemMessage.getParticipantsChange();
                        if ((participantsChange9 != null ? participantsChange9.removedUsers : null) == null) {
                            ParticipantsChange participantsChange10 = systemMessage.getParticipantsChange();
                            if ((participantsChange10 != null ? participantsChange10.removedGroups : null) == null) {
                                ParticipantsChange participantsChange11 = systemMessage.getParticipantsChange();
                                if ((participantsChange11 != null ? participantsChange11.removedDepartments : null) == null) {
                                    ParticipantsChange participantsChange12 = systemMessage.getParticipantsChange();
                                }
                            }
                        }
                        techUsersRemovedFromChatMessage = new TechUsersRemovedFromChatMessage();
                        ParticipantsChange participantsChange13 = systemMessage.getParticipantsChange();
                        reducedUserInfoArr = participantsChange13 != null ? participantsChange13.removedUsers : null;
                        techUsersRemovedFromChatMessage.guids = new String[0];
                        if (reducedUserInfoArr != null && reducedUserInfoArr.length > 0) {
                            techUsersRemovedFromChatMessage.guids = new String[reducedUserInfoArr.length];
                            int length4 = reducedUserInfoArr.length;
                            while (i2 < length4) {
                                String[] strArr4 = techUsersRemovedFromChatMessage.guids;
                                ReducedUserInfo reducedUserInfo4 = reducedUserInfoArr[i2];
                                strArr4[i2] = reducedUserInfo4 != null ? reducedUserInfo4.userId : null;
                                i2++;
                            }
                        }
                        ParticipantsChange participantsChange14 = systemMessage.getParticipantsChange();
                        techUsersRemovedFromChatMessage.groups = participantsChange14 != null ? participantsChange14.removedGroups : null;
                        ParticipantsChange participantsChange15 = systemMessage.getParticipantsChange();
                        techUsersRemovedFromChatMessage.departments = participantsChange15 != null ? participantsChange15.removedDepartments : null;
                        ParticipantsChange participantsChange16 = systemMessage.getParticipantsChange();
                        techUsersRemovedFromChatMessage.guestsGuids = participantsChange16 != null ? participantsChange16.guestsGuids : null;
                    }
                    Integer userAction = systemMessage.getUserAction();
                    if (userAction != null && userAction.intValue() == 1) {
                        ?? techUserJoinChatMessage = new TechUserJoinChatMessage();
                        techUserJoinChatMessage.guid = serverMessageInfo.from.userId;
                        techBaseMessage = techUserJoinChatMessage;
                    } else {
                        Integer userAction2 = systemMessage.getUserAction();
                        if (userAction2 != null && userAction2.intValue() == 2) {
                            ?? techUserJoinChatByLinkMessage = new TechUserJoinChatByLinkMessage();
                            techUserJoinChatByLinkMessage.guid = serverMessageInfo.from.userId;
                            techBaseMessage = techUserJoinChatByLinkMessage;
                        } else {
                            Integer userAction3 = systemMessage.getUserAction();
                            if (userAction3 != null && userAction3.intValue() == 0) {
                                ?? techUserLeaveChatMessage = new TechUserLeaveChatMessage();
                                techUserLeaveChatMessage.guid = serverMessageInfo.from.userId;
                                techBaseMessage = techUserLeaveChatMessage;
                            } else if (systemMessage.getCallInfo() != null) {
                                str2 = serverMessageInfo.from.userId;
                                ?? techCallInfoMessage = new TechCallInfoMessage();
                                techCallInfoMessage.callInfo = systemMessage.getCallInfo();
                                techBaseMessage = techCallInfoMessage;
                            } else if (systemMessage.getGenericMessage() != null) {
                                ?? techGenericMessage = new TechGenericMessage();
                                SystemGenericMessage genericMessage = systemMessage.getGenericMessage();
                                techGenericMessage.messageText = genericMessage != null ? genericMessage.messageText : null;
                                techBaseMessage = techGenericMessage;
                            } else {
                                r96 r96Var = tz10.p;
                                lqo lqoVar = this.a;
                                if (lqoVar.a(r96Var) && systemMessage.getMeetingStartedMessage() != null) {
                                    str2 = serverMessageInfo.from.userId;
                                    ?? techMeetingStartedMessage = new TechMeetingStartedMessage();
                                    MeetingStartedMessage meetingStartedMessage = systemMessage.getMeetingStartedMessage();
                                    techMeetingStartedMessage.meetingId = meetingStartedMessage != null ? meetingStartedMessage.meetingId : null;
                                    techMeetingStartedMessage.callType = systemMessage.getMeetingStartedMessage().callType;
                                    techBaseMessage = techMeetingStartedMessage;
                                } else if (lqoVar.a(r96Var) && systemMessage.getMeetingEndedMessage() != null) {
                                    ?? techMeetingEndedMessage = new TechMeetingEndedMessage();
                                    techMeetingEndedMessage.meetingId = systemMessage.getMeetingEndedMessage().meetingId;
                                    techMeetingEndedMessage.callType = systemMessage.getMeetingEndedMessage().callType;
                                    techBaseMessage = techMeetingEndedMessage;
                                } else if (systemMessage.getPersonalMeetingEndedMessage() != null) {
                                    str2 = serverMessageInfo.from.userId;
                                    ?? techPersonalMeetingEndedMessage = new TechPersonalMeetingEndedMessage();
                                    techPersonalMeetingEndedMessage.meetingId = systemMessage.getPersonalMeetingEndedMessage().getMeetingId();
                                    techPersonalMeetingEndedMessage.reason = systemMessage.getPersonalMeetingEndedMessage().getReason();
                                    techPersonalMeetingEndedMessage.durationSeconds = systemMessage.getPersonalMeetingEndedMessage().getDurationSeconds();
                                    techPersonalMeetingEndedMessage.callType = systemMessage.getPersonalMeetingEndedMessage().getCallType();
                                    techBaseMessage = techPersonalMeetingEndedMessage;
                                } else {
                                    techBaseMessage = new TechUnknownMessage();
                                }
                            }
                        }
                    }
                }
            }
            techBaseMessage = techUsersRemovedFromChatMessage;
            reducedUserInfoArr2 = reducedUserInfoArr;
        }
        String str3 = str2;
        techBaseMessage.initiator = serverMessageInfo.from.userId;
        techBaseMessage.isSilent = z;
        techBaseMessage.notificationBehaviour = i;
        Message message = new Message(systemMessage.getChatId(), serverMessageInfo.timestamp, serverMessageInfo.seqNo, serverMessageInfo.prevTimestamp, serverMessageInfo.historyVersion, systemMessage.getPayloadId(), str3, techBaseMessage, null, 0L, serverMessageInfo.version, serverMessageInfo.from, serverMessageInfo.customFrom, serverMessageInfo.moderationAction, 0L, 0L, notificationMeta, z2, serverMessageInfo.threadState, false, z3);
        message.r = reducedUserInfoArr2;
        return message;
    }

    public final Message[] g(ChatHistoryResponse.OutMessage[] outMessageArr) {
        if (outMessageArr == null) {
            return null;
        }
        List A = j73.A(outMessageArr);
        ArrayList arrayList = new ArrayList(tcc.n(A, 10));
        Iterator it = A.iterator();
        while (it.hasNext()) {
            arrayList.add(b(((ChatHistoryResponse.OutMessage) it.next()).serverMessage));
        }
        return (Message[]) arrayList.toArray(new Message[0]);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Suggest h(SuggestButton suggestButton, String str, String str2) {
        SuggestButton suggestButton2;
        EmptyList emptyList;
        ArrayList arrayList = new ArrayList();
        String text = suggestButton.getText();
        AiBotDirective[] directives = suggestButton.getDirectives();
        if (directives != null) {
            ArrayList arrayList2 = new ArrayList();
            int length = directives.length;
            int i = 0;
            while (i < length) {
                AiBotDirective aiBotDirective = directives[i];
                ks10 ks10Var = this;
                SuggestButton suggestButton3 = suggestButton;
                String str3 = str;
                String str4 = str2;
                Directive a = ks10Var.a(aiBotDirective, arrayList, new u50(ks10Var, suggestButton3, aiBotDirective, str3, str4));
                if (a != null) {
                    arrayList2.add(a);
                }
                i++;
                this = ks10Var;
                suggestButton = suggestButton3;
                str = str3;
                str2 = str4;
            }
            suggestButton2 = suggestButton;
            emptyList = arrayList2;
        } else {
            suggestButton2 = suggestButton;
            emptyList = EmptyList.a;
        }
        if (arrayList.isEmpty()) {
            arrayList = null;
        }
        return new Suggest(text, emptyList, arrayList, suggestButton2.getElementId());
    }
}
