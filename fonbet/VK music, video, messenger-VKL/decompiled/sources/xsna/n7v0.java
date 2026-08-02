package xsna;

import com.vk.core.tool.onboarding.VkOnboarding$GraffitiAlignment;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import xsna.tra0;

/* compiled from: VkOnboardingBanner.kt */
/* loaded from: classes17.dex */
public final class n7v0 implements b540 {
    public final /* synthetic */ VkOnboarding$GraffitiAlignment a;
    public final /* synthetic */ float b;

    /* compiled from: VkOnboardingBanner.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[VkOnboarding$GraffitiAlignment.values().length];
            try {
                iArr[VkOnboarding$GraffitiAlignment.Start.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[VkOnboarding$GraffitiAlignment.End.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public n7v0(VkOnboarding$GraffitiAlignment vkOnboarding$GraffitiAlignment, float f) {
        this.a = vkOnboarding$GraffitiAlignment;
        this.b = f;
    }

    @Override // xsna.b540
    public final dp10 b(ep10 ep10Var, List<? extends List<? extends zo10>> list, long j) {
        int b;
        ArrayList arrayList = (ArrayList) list;
        List list2 = (List) arrayList.get(0);
        List list3 = (List) arrayList.get(1);
        List list4 = (List) arrayList.get(2);
        long b2 = s6j.b(0, o6j.i(j), 0, o6j.h(j), 5);
        final tra0 N = ((zo10) j5g.Y(list3)).N(j);
        tra0 N2 = ((zo10) j5g.Y(list2)).N(b2);
        final tra0 N3 = ((zo10) j5g.Y(list4)).N(b2);
        int i = a.$EnumSwitchMapping$0[this.a.ordinal()];
        if (i == 1) {
            b = an10.b(ep10Var.I0(kqu0.o) + ep10Var.I0(kqu0.v) + N2.b);
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            b = an10.b((N.b - N3.b) - ep10Var.I0(kqu0.o));
        }
        final long b3 = (b << 32) | (an10.b((N.c - ep10Var.I0(kqu0.v)) - N2.c) & 4294967295L);
        return ep10Var.Q(N.b, ep10Var.r0(this.b) + N.c, jgp.b, new izs() { // from class: xsna.m7v0
            @Override // xsna.izs
            public final Object invoke(Object obj) {
                tra0.a aVar = (tra0.a) obj;
                tra0.a.x(aVar, tra0.this, 0, 0);
                tra0.a.y(aVar, N3, b3);
                return s3q0.a;
            }
        });
    }
}
