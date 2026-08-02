package xsna;

import android.content.Context;
import com.vk.api.sdk.exceptions.VKApiException;
import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.api.sdk.exceptions.VKLargeEntityException;
import com.vk.dto.user.UserSex;
import com.vk.im.engine.exceptions.ImEngineUnrecoverableException;
import com.vk.im.engine.exceptions.NoNetworkConnectionException;
import com.vk.im.engine.exceptions.attach.AttachUploadException;
import com.vk.im.engine.exceptions.chat.AlreadyInChatException;
import com.vk.im.engine.exceptions.chat.ChatInvitationException;
import com.vk.im.ui.components.common.NotifyId;
import com.vk.log.L;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutionException;

/* compiled from: NotifyIdUtils.kt */
/* loaded from: classes2.dex */
public final class zk70 {
    public static final zk70 a = new zk70();

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x0140, code lost:
    
        if (r5.equals("messages.setConversationStyle") == false) goto L150;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x014c, code lost:
    
        return com.vk.im.ui.components.common.NotifyId.CHAT_ACCESS_DENIED;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x0147, code lost:
    
        if (r5.equals("messages.getChatPreview") == false) goto L150;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final NotifyId a(Throwable th) {
        if (th instanceof ExecutionException) {
            return a(((ExecutionException) th).getCause());
        }
        if (th instanceof AttachUploadException) {
            return a(((AttachUploadException) th).getCause());
        }
        if (!(th instanceof VKApiExecutionException)) {
            if (!(th instanceof VKApiException)) {
                return th instanceof ChatInvitationException.AllMembers ? NotifyId.CHAT_INVITATION_ERROR_ALL_USERS : th instanceof ChatInvitationException.SeveralMembers ? NotifyId.CHAT_INVITATION_ERROR_SOME_USERS : th instanceof ChatInvitationException.OneMember ? ((ChatInvitationException.OneMember) th).h().B2() == UserSex.FEMALE ? NotifyId.CHAT_INVITATION_ERROR_ONE_FEMALE : NotifyId.CHAT_INVITATION_ERROR_ONE_MALE : th instanceof AlreadyInChatException ? NotifyId.CHAT_USER_ALREADY_IN_CHAT : ((th instanceof IOException) || (th instanceof NoNetworkConnectionException)) ? NotifyId.ERROR_TYPE_NETWORK : th instanceof ImEngineUnrecoverableException ? NotifyId.ERROR_TYPE_UNRECOVERABLE : th instanceof VKLargeEntityException ? NotifyId.TOO_LARGE_FILE : NotifyId.ERROR_TYPE_INTERNAL;
            }
            Throwable cause = ((VKApiException) th).getCause();
            return cause instanceof VKLargeEntityException ? a(cause) : NotifyId.ERROR_TYPE_API;
        }
        VKApiExecutionException vKApiExecutionException = (VKApiExecutionException) th;
        a.getClass();
        switch (vKApiExecutionException.s()) {
            case Integer.MIN_VALUE:
                List<VKApiExecutionException> v = vKApiExecutionException.v();
                return a(v != null ? (VKApiExecutionException) j5g.a0(v) : null);
            case -1:
                return NotifyId.ERROR_TYPE_NETWORK;
            case 5:
                return NotifyId.ERROR_AUTH;
            case 7:
                return epx.f(vKApiExecutionException.g(), "messages.send") ? NotifyId.MSG_SEND_DENIED : NotifyId.ERROR_TYPE_API;
            case 9:
            case 29:
                return epx.f(vKApiExecutionException.g(), "messages.getChatPreview") ? NotifyId.CHAT_PREVIEW_FLOOD_CONTROL : NotifyId.TOO_MANY_SIMILAR_REQUESTS;
            case 15:
                String g = vKApiExecutionException.g();
                switch (g.hashCode()) {
                    case -1426272180:
                        if (g.equals("account.changePassword")) {
                            return NotifyId.ACCOUNT_INVALID_OLD_PASSWORD;
                        }
                        return NotifyId.ERROR_TYPE_API;
                    case -1402447518:
                        if (g.equals("messages.addChatUser")) {
                            return NotifyId.CHAT_USER_PROHIBITED_INVITATION_TO_CHATS;
                        }
                        return NotifyId.ERROR_TYPE_API;
                    case -304541444:
                        break;
                    case -86089202:
                        break;
                    default:
                        return NotifyId.ERROR_TYPE_API;
                }
            case 22:
                return NotifyId.CHAT_INCORRECT_AVATAR;
            case 100:
                String g2 = vKApiExecutionException.g();
                switch (g2.hashCode()) {
                    case -304541444:
                        if (g2.equals("messages.getChatPreview")) {
                            return NotifyId.CHAT_PREVIEW_INVALID_LINK;
                        }
                        break;
                    case -218679078:
                        if (g2.equals("channels.create")) {
                            return NotifyId.CHANNEL_INVALID_TITLE;
                        }
                        break;
                    case 1031430230:
                        if (g2.equals("messages.createChat")) {
                            return NotifyId.CHAT_USER_CANNOT_BE_INVITED;
                        }
                        break;
                    case 1260429950:
                        if (g2.equals("messages.joinChatByInviteLink")) {
                            return NotifyId.CHAT_INVITE_INVALID_LINK;
                        }
                        break;
                }
                return NotifyId.ERROR_TYPE_API;
            case 103:
                return NotifyId.CHAT_TOO_MANY_MEMBERS;
            case JSON_ENCODE_ERROR_VALUE:
                return epx.f(vKApiExecutionException.g(), "channels.create") ? NotifyId.CHANNEL_INVALID_TITLE : NotifyId.ERROR_TYPE_API;
            case 130:
                return NotifyId.INVALID_FILE_EXTENSION;
            case 917:
                return NotifyId.CHAT_ACCESS_DENIED;
            case 919:
                return NotifyId.CHAT_MAKE_LINK_DENIED;
            case 924:
                return NotifyId.MSG_DELETE_FOR_ALL_FAILED;
            case 925:
                String g3 = vKApiExecutionException.g();
                switch (g3.hashCode()) {
                    case -1473776439:
                        if (g3.equals("messages.removeChatUser")) {
                            return NotifyId.CHAT_KICK_PERMISSION_DENIED;
                        }
                        break;
                    case -1402447518:
                        if (g3.equals("messages.addChatUser")) {
                            return NotifyId.CHAT_INVITE_PERMISSION_DENIED;
                        }
                        break;
                    case -1269688845:
                        if (g3.equals("messages.pin")) {
                            return NotifyId.CHAT_PIN_PERMISSION_DENIED;
                        }
                        break;
                    case -395496134:
                        if (g3.equals("messages.unpin")) {
                            return NotifyId.CHAT_UNPIN_PERMISSION_DENIED;
                        }
                        break;
                    case 573245156:
                        if (g3.equals("messages.editChat")) {
                            return NotifyId.CHAT_CHANGE_TITLE_PERMISSION_DENIED;
                        }
                        break;
                    case 1146153178:
                        if (g3.equals("messages.setChatPhoto")) {
                            return NotifyId.CHAT_CHANGE_AVATAR_PERMISSION_DENIED;
                        }
                        break;
                }
                return NotifyId.CHAT_ETC_PERMISSION_DENIED;
            case 927:
                return NotifyId.CHAT_DOES_NOT_EXIST;
            case 932:
                return NotifyId.CHAT_COMMUNITY_CANT_INTERACT_WITH_THIS_PEER;
            case 936:
                return NotifyId.CHAT_CONTACT_NOT_FOUND;
            case 939:
                return NotifyId.CODE_CHAT_MR_ALREADY_SEND;
            case 945:
                return NotifyId.CHAT_WAS_DISABLED;
            case 946:
                return NotifyId.CHAT_NOT_SUPPORTED;
            case 947:
                return NotifyId.CHAT_INVITE_GROUP_INACCESSIBLE;
            case 959:
                return NotifyId.MSG_AUDIO_TRANSCRIPT_EDIT_FAILED;
            case 967:
                return NotifyId.CHAT_USER_CANT_BE_ADDED_TO_WORK_CHAT_NOT_EMPLOYEE;
            case 982:
                return NotifyId.CHAT_INVITATION_FORBIDDEN;
            case 984:
                return epx.f(vKApiExecutionException.g(), "messages.createChat") ? NotifyId.CHAT_CANNOT_CREATE_DUE_TO_SPAM_BLOCK : NotifyId.ERROR_TYPE_API;
            case 1000:
                return NotifyId.AUTH_PHONE_PARAM_PHONE;
            case 1017:
                return NotifyId.CHAT_DELETED_WITH_HISTORY;
            case 1019:
                return NotifyId.CHAT_CANNOT_BE_JOINED_AS_ORG_MEMBER;
            case 1110:
                return NotifyId.AUTH_CODE_INCORRECT;
            case 1260:
                return NotifyId.SCREEN_NAME_FORMAT_ERROR;
            case 4600:
                return NotifyId.MSG_UPLOAD_PHOTO_DECODE_FAILED;
            case 4601:
                return NotifyId.MSG_UPLOAD_PHOTO_WRONG_IMAGE_SIZE;
            case 4602:
                return NotifyId.MSG_UPLOAD_PHOTO_PREPROCESS_FAILED;
            default:
                return NotifyId.ERROR_TYPE_API;
        }
    }

    public static final String b(Throwable th) {
        a.getClass();
        Context context = e43.a;
        if (context == null) {
            context = null;
        }
        int h = a(th).h();
        Object[] objArr = th instanceof ChatInvitationException.OneMember ? new Object[]{((ChatInvitationException.OneMember) th).h().name()} : new Object[0];
        return context.getString(h, Arrays.copyOf(objArr, objArr.length));
    }

    public static final void c(NotifyId notifyId) {
        d(notifyId, new Object[0]);
    }

    public static final void d(NotifyId notifyId, Object[] objArr) {
        a.getClass();
        Context context = e43.a;
        Context context2 = context != null ? context : null;
        if (context == null) {
            context = null;
        }
        enj.r(context2, context.getString(notifyId.h(), Arrays.copyOf(objArr, objArr.length)), 0);
    }

    public static final void e(Throwable th) {
        NotifyId a2 = a(th);
        a.getClass();
        d(a2, th instanceof ChatInvitationException.OneMember ? new Object[]{((ChatInvitationException.OneMember) th).h().name()} : new Object[0]);
        L.i(th);
    }
}
