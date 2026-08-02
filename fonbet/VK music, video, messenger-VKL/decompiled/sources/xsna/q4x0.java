package xsna;

import com.vk.core.serialize.Serializer;
import com.vk.core.tool.onboarding.VkTooltip$BalloonTilt;
import com.vk.voip.dto.RecordType;
import com.vk.voip.dto.call_member.CallMemberId;
import com.vk.voip.ui.accessibility.AccessibilityEvents;
import java.util.Collections;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import xsna.g9v0;
import xsna.gf8;
import xsna.y5j;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class q4x0 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ q4x0(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        float h;
        int i = this.b;
        Object obj2 = this.d;
        Object obj3 = this.c;
        int i2 = 1;
        switch (i) {
            case 0:
                r4x0 r4x0Var = (r4x0) obj2;
                gf8.a aVar = (gf8.a) obj;
                boolean z = ((io.reactivex.rxjava3.subjects.d) obj3).P0() == RecordType.RECORD;
                AccessibilityEvents accessibilityEvents = r4x0Var.f;
                Serializer.c<CallMemberId> cVar = CallMemberId.CREATOR;
                List singletonList = Collections.singletonList(CallMemberId.a.a(aVar.a.a));
                if (z) {
                    accessibilityEvents.getClass();
                    accessibilityEvents.d(new j3(i2, accessibilityEvents, singletonList));
                } else {
                    accessibilityEvents.getClass();
                    accessibilityEvents.d(new kg(1, accessibilityEvents, singletonList));
                }
                return new jf8(z, aVar.a);
            default:
                Pair pair = (Pair) obj3;
                i6j i6jVar = (i6j) obj;
                float f = ((pco) pair.d()).b;
                float f2 = ((pco) pair.g()).b;
                s5j s5jVar = new s5j("anchor");
                s5j s5jVar2 = new s5j("balloon");
                int i3 = g9v0.a.$EnumSwitchMapping$3[((VkTooltip$BalloonTilt) obj2).ordinal()];
                int i4 = 2;
                if (i3 == 1) {
                    h = e06.Near.h();
                } else {
                    if (i3 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    h = e06.Far.h();
                }
                y5j.b f3 = i6jVar.f(f / 2);
                y5j.a d = i6jVar.d(f2 - h);
                i6jVar.c(s5jVar, new ev60(22));
                i6jVar.c(s5jVar2, new obt0(i4, f3, d));
                return s3q0.a;
        }
    }
}
