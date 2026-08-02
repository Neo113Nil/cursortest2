package xsna;

import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.vk.registration.funnels.RegistrationFunnelScreenStack;
import com.vk.stat.sak.scheme.SchemeStatSak$EventScreen;
import com.vk.stat.sak.scheme.SchemeStatSak$TypeRegistrationItem;
import java.util.ArrayList;
import java.util.ListIterator;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class drf0 implements gzs {
    public final /* synthetic */ SchemeStatSak$EventScreen b;
    public final /* synthetic */ SchemeStatSak$EventScreen c;
    public final /* synthetic */ SchemeStatSak$TypeRegistrationItem.EventType d;
    public final /* synthetic */ ArrayList e;
    public final /* synthetic */ Long f;

    public /* synthetic */ drf0(SchemeStatSak$EventScreen schemeStatSak$EventScreen, SchemeStatSak$EventScreen schemeStatSak$EventScreen2, SchemeStatSak$TypeRegistrationItem.EventType eventType, ArrayList arrayList, Long l) {
        this.b = schemeStatSak$EventScreen;
        this.c = schemeStatSak$EventScreen2;
        this.d = eventType;
        this.e = arrayList;
        this.f = l;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        int i;
        SchemeStatSak$EventScreen schemeStatSak$EventScreen = this.b;
        if (schemeStatSak$EventScreen == null && (schemeStatSak$EventScreen = frf0.a.Ab()) == null) {
            schemeStatSak$EventScreen = SchemeStatSak$EventScreen.NOWHERE;
        }
        SchemeStatSak$EventScreen schemeStatSak$EventScreen2 = schemeStatSak$EventScreen;
        frf0.m(this.c, false);
        frf0.j(this.d, schemeStatSak$EventScreen2, this.e, this.f, null, PsExtractor.VIDEO_STREAM_MASK);
        RegistrationFunnelScreenStack registrationFunnelScreenStack = frf0.a;
        sk3<RegistrationFunnelScreenStack.RegistrationFunnelScreen> sk3Var = registrationFunnelScreenStack.b;
        ListIterator<RegistrationFunnelScreenStack.RegistrationFunnelScreen> listIterator = sk3Var.listIterator(sk3Var.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                i = -1;
                break;
            }
            if (listIterator.previous().b == schemeStatSak$EventScreen2) {
                i = listIterator.nextIndex();
                break;
            }
        }
        if (i != -1) {
            if (sk3Var.size() - i > 2) {
                par0.a.getClass();
                par0.b("[RegistrationFunnelScreenStack] resetToOrReplaceLast: too many intermediate screens screen = " + schemeStatSak$EventScreen2 + " stack = " + sk3Var);
            }
            sk3<RegistrationFunnelScreenStack.RegistrationFunnelScreen> sk3Var2 = registrationFunnelScreenStack.b;
            int size = sk3Var2.size();
            while (true) {
                i++;
                if (i >= size) {
                    break;
                }
                sk3Var2.m();
            }
        } else {
            par0.a.getClass();
            par0.b("[RegistrationFunnelScreenStack] resetToOrReplaceLast: there isn't screen " + schemeStatSak$EventScreen2 + " in stack " + sk3Var);
            sk3Var.m();
            registrationFunnelScreenStack.Bb(schemeStatSak$EventScreen2, false);
        }
        return s3q0.a;
    }
}
