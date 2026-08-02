package xsna;

import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Peer;
import com.vk.dto.messages.MessageSource;
import com.vk.im.engine.internal.api_commands.diff.MessagesGetDiffContentApiCmd;
import com.vk.im.engine.models.LongPollType;
import com.vk.im.engine.models.messages.Msg;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.EmptyList;

/* compiled from: GetDiffContentLogic.kt */
/* loaded from: classes2.dex */
public final class brt {

    /* compiled from: GetDiffContentLogic.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[MessageSource.values().length];
            try {
                iArr[MessageSource.DIFF_CONTENT_WARMUP_READ.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MessageSource.DIFF_CONTENT_WARMUP_READ_PUSH.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[MessageSource.DIFF_CONTENT_WARMUP_REPLY_MENTION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[MessageSource.DIFF_CONTENT_WARMUP_REPLY_MENTION_PUSH.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[MessageSource.DIFF_CONTENT_WARMUP_REACTION.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[MessageSource.DIFF_CONTENT_WARMUP_REACTION_PUSH.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[MessageSource.DIFF_CONTENT_WARMUP_LAST.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[MessageSource.DIFF_CONTENT_WARMUP_LAST_PUSH.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final void a(ArrayList arrayList, List list, MessageSource messageSource) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            int intValue = ((Number) it.next()).intValue();
            if (!arrayList.isEmpty()) {
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    if (((Number) ((Pair) it2.next()).i()).intValue() == intValue) {
                        break;
                    }
                }
            }
            arrayList.add(new Pair(Integer.valueOf(intValue), messageSource));
        }
    }

    public static final void b(w2w w2wVar, ArrayList arrayList, boolean z) {
        ArrayList arrayList2;
        MessagesGetDiffContentApiCmd.b bVar;
        List<MessagesGetDiffContentApiCmd.a> list;
        Object obj;
        Integer valueOf;
        int intValue;
        MessagesGetDiffContentApiCmd.MessagesDiffContentInput messagesDiffContentInput;
        Integer b;
        try {
            arrayList2 = arrayList;
            try {
                bVar = (MessagesGetDiffContentApiCmd.b) fo50.v(new MessagesGetDiffContentApiCmd(arrayList2, w2wVar.Q0()), w2wVar, "MessagesGetDiffContentApiCmd", 2);
            } catch (VKApiExecutionException e) {
                e = e;
                com.vk.metrics.eventtracking.b.a.a(e);
                bVar = null;
                if (bVar != null) {
                    return;
                } else {
                    return;
                }
            }
        } catch (VKApiExecutionException e2) {
            e = e2;
            arrayList2 = arrayList;
        }
        if (bVar != null || (list = bVar.a) == null) {
            return;
        }
        for (MessagesGetDiffContentApiCmd.a aVar : list) {
            List<Msg> list2 = aVar.b;
            long j = aVar.a;
            if (!list2.isEmpty()) {
                Serializer.c<Peer> cVar = Peer.CREATOR;
                Peer b2 = Peer.a.b(j);
                Iterator it = arrayList2.iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj = it.next();
                        if (((MessagesGetDiffContentApiCmd.MessagesDiffContentInput) ((Pair) obj).i()).c() == j) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                Pair pair = (Pair) obj;
                if (pair == null || (messagesDiffContentInput = (MessagesGetDiffContentApiCmd.MessagesDiffContentInput) pair.i()) == null || (b = messagesDiffContentInput.b()) == null) {
                    Iterator<T> it2 = aVar.b.iterator();
                    if (it2.hasNext()) {
                        valueOf = Integer.valueOf(((Msg) it2.next()).d);
                        while (it2.hasNext()) {
                            Integer valueOf2 = Integer.valueOf(((Msg) it2.next()).d);
                            if (valueOf.compareTo(valueOf2) > 0) {
                                valueOf = valueOf2;
                            }
                        }
                    } else {
                        valueOf = null;
                    }
                    intValue = valueOf != null ? valueOf.intValue() : Integer.MAX_VALUE;
                } else {
                    intValue = b.intValue();
                }
                Object o = new com.vk.im.engine.internal.merge.messages.b(b2, intValue, (List) aVar.b, false, false, (Boolean) null, 120).o(w2wVar);
                List list3 = (List) o;
                if (!z || list3.isEmpty()) {
                    o = null;
                }
                List list4 = (List) o;
                if (list4 != null) {
                    long j2 = aVar.a;
                    List list5 = list4;
                    ArrayList arrayList3 = new ArrayList(c5g.u(list5, 10));
                    Iterator it3 = list5.iterator();
                    while (it3.hasNext()) {
                        arrayList3.add(Integer.valueOf(((Msg) it3.next()).b));
                    }
                    w2wVar.e1("GetDiffContentLogic", new e980("GetDiffContentLogic", j2, arrayList3, EmptyList.b, LongPollType.MESSAGES));
                }
            }
        }
    }
}
