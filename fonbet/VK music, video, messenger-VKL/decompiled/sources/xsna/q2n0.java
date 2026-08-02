package xsna;

import com.vk.dto.attaches.Attach;
import com.vk.dto.attaches.AttachAudio;
import com.vk.dto.attaches.AttachAudioMsg;
import com.vk.dto.attaches.AttachDoc;
import com.vk.dto.attaches.AttachImage;
import com.vk.im.engine.models.attaches.AttachVideo;
import com.vk.im.engine.models.messages.Msg;
import com.vk.im.engine.reporters.performance.events.VkmSuccessRateEventBuilder;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.builders.ListBuilder;

/* compiled from: SuccessRateSendMsgReporterImpl.kt */
/* loaded from: classes5.dex */
public final class q2n0 implements p2n0 {
    public final VkmSuccessRateEventBuilder.EventName a;

    public q2n0(VkmSuccessRateEventBuilder.EventName eventName) {
        this.a = eventName;
    }

    public static void d(q2n0 q2n0Var, VkmSuccessRateEventBuilder.EventType eventType, int i, List list, String str, Long l, boolean z, int i2) {
        String g0;
        String str2 = (i2 & 8) != 0 ? "" : str;
        Long l2 = (i2 & 16) != 0 ? null : l;
        boolean z2 = (i2 & 32) != 0 ? false : z;
        if (i % 1000 == 499) {
            VkmSuccessRateEventBuilder.EventName eventName = q2n0Var.a;
            String c = com.vk.core.utils.newtork.b.c().c();
            if (list.isEmpty()) {
                g0 = "empty";
            } else {
                ListBuilder e = e43.e();
                List list2 = list;
                boolean z3 = list2 instanceof Collection;
                if (!z3 || !list2.isEmpty()) {
                    Iterator it = list2.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        } else if (((Attach) it.next()) instanceof AttachImage) {
                            e.add("photo");
                            break;
                        }
                    }
                }
                if (!z3 || !list2.isEmpty()) {
                    Iterator it2 = list2.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        } else if (((Attach) it2.next()) instanceof AttachVideo) {
                            e.add("video");
                            break;
                        }
                    }
                }
                if (!z3 || !list2.isEmpty()) {
                    Iterator it3 = list2.iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            break;
                        } else if (((Attach) it3.next()) instanceof AttachAudio) {
                            e.add("audio");
                            break;
                        }
                    }
                }
                if (!z3 || !list2.isEmpty()) {
                    Iterator it4 = list2.iterator();
                    while (true) {
                        if (!it4.hasNext()) {
                            break;
                        } else if (((Attach) it4.next()) instanceof AttachAudioMsg) {
                            e.add("audioMsg");
                            break;
                        }
                    }
                }
                if (!z3 || !list2.isEmpty()) {
                    Iterator it5 = list2.iterator();
                    while (true) {
                        if (!it5.hasNext()) {
                            break;
                        } else if (((Attach) it5.next()) instanceof AttachDoc) {
                            e.add("doc");
                            break;
                        }
                    }
                }
                ListBuilder g = e.g();
                g0 = g.isEmpty() ? "other" : j5g.g0(g, null, null, null, 0, null, 63);
            }
            new com.vk.im.engine.reporters.performance.events.a(eventName, eventType, c, g0, str2, l2 != null ? Integer.valueOf((int) (System.currentTimeMillis() - l2.longValue())) : null, z2).q();
        }
    }

    @Override // xsna.p2n0
    public final void a(int i, long j, List list, boolean z) {
        d(this, VkmSuccessRateEventBuilder.EventType.END, i, list, null, Long.valueOf(j), z, 8);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.p2n0
    public final void b(List<? extends Msg> list) {
        for (Msg msg : list) {
            if (msg instanceof com.vk.im.engine.models.messages.a) {
                d(this, VkmSuccessRateEventBuilder.EventType.START, msg.b, ((com.vk.im.engine.models.messages.a) msg).K0(), null, null, false, 56);
            }
        }
    }

    @Override // xsna.p2n0
    public final void c(int i, List<? extends Attach> list, String str, long j) {
        d(this, VkmSuccessRateEventBuilder.EventType.ERROR, i, list, str, Long.valueOf(j), false, 32);
    }
}
