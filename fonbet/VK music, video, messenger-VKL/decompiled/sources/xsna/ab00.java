package xsna;

import androidx.compose.runtime.a;
import com.vk.music.stickyplayer.presentation.components.radio.RadioPlayerSheetTab;
import xsna.awe0;
import xsna.dz40;
import xsna.gfp0;
import xsna.kb00;
import xsna.q630;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class ab00 implements yzs {
    public final /* synthetic */ int b = 0;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ mtk0 d;
    public final /* synthetic */ izs e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;

    public /* synthetic */ ab00(dz40.j jVar, boolean z, xvy xvyVar, x17 x17Var, Object obj, izs izsVar, mtk0 mtk0Var) {
        this.f = jVar;
        this.c = z;
        this.g = xvyVar;
        this.h = x17Var;
        this.i = obj;
        this.e = izsVar;
        this.d = mtk0Var;
    }

    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, java.util.List] */
    @Override // xsna.yzs
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        dz40.n.d dVar;
        boolean z;
        switch (this.b) {
            case 0:
                dz40.j jVar = (dz40.j) this.f;
                xvy xvyVar = (xvy) this.g;
                x17 x17Var = (x17) this.h;
                va8 va8Var = (va8) obj;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj2;
                int intValue = ((Integer) obj3).intValue();
                if ((intValue & 6) == 0) {
                    intValue |= aVar.J(va8Var) ? 4 : 2;
                }
                if (aVar.t(intValue & 1, (intValue & 19) != 18)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1924365060, intValue, -1, "com.vk.music.stickyplayer.presentation.components.LyricsPage.<anonymous> (LyricsPage.kt:115)");
                    }
                    ?? r5 = jVar.c;
                    if (this.c) {
                        aVar.K(464034207);
                        kb00.a(va8Var, aVar, intValue & 14);
                        aVar.j();
                    } else {
                        aVar.K(464098749);
                        int i = kb00.a.$EnumSwitchMapping$0[jVar.b.ordinal()];
                        if (i != 1) {
                            izs izsVar = this.e;
                            if (i == 2) {
                                aVar.K(1816090650);
                                kb00.b(va8Var, jVar, xvyVar, x17Var, r5, this.i, izsVar, this.d, aVar, intValue & 14);
                                aVar.j();
                            } else if (i == 3) {
                                aVar.K(1816103984);
                                kb00.c(0, aVar);
                                aVar.j();
                            } else {
                                if (i != 4) {
                                    throw alb0.c(1816086669, aVar);
                                }
                                aVar.K(1816105906);
                                kb00.e(izsVar, aVar, 0);
                                aVar.j();
                            }
                        } else {
                            aVar.K(1816088304);
                            kb00.h(r5, aVar, 0);
                            aVar.j();
                        }
                        aVar.j();
                    }
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                return s3q0.a;
            default:
                gfp0.d dVar2 = (gfp0.d) this.f;
                h17 h17Var = (h17) this.g;
                wh50 wh50Var = (wh50) this.h;
                mtk0 mtk0Var = (mtk0) this.i;
                RadioPlayerSheetTab radioPlayerSheetTab = (RadioPlayerSheetTab) obj;
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                if ((intValue2 & 6) == 0) {
                    intValue2 |= aVar2.o(radioPlayerSheetTab.ordinal()) ? 4 : 2;
                }
                if (aVar2.t(intValue2 & 1, (intValue2 & 19) != 18)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(864684699, intValue2, -1, "com.vk.music.stickyplayer.presentation.RadioContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (RadioWithBottomPlayer.kt:246)");
                    }
                    if (awe0.a.$EnumSwitchMapping$0[radioPlayerSheetTab.ordinal()] != 1) {
                        throw alb0.c(2033309465, aVar2);
                    }
                    aVar2.K(2033332100);
                    dz40.n.d dVar3 = (dz40.n.d) mtk0Var.getValue();
                    boolean z2 = false;
                    String str = dVar2.a;
                    if (this.c && !dVar2.a()) {
                        z2 = true;
                    }
                    boolean c = h17Var.a.c();
                    boolean z3 = !dVar2.a();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-348425971, 12585984, -1, "com.vk.music.stickyplayer.presentation.components.radio.RadioPlaybackQueue.Companion.invoke (RadioPlaybackQueue.kt:59)");
                    }
                    Object x = aVar2.x();
                    if (x == a.C0011a.a) {
                        dVar = dVar3;
                        z = z2;
                        wte0 wte0Var = new wte0(dVar, str, z, c, z3, this.d, wh50Var);
                        aVar2.R(wte0Var);
                        x = wte0Var;
                    } else {
                        dVar = dVar3;
                        z = z2;
                    }
                    wte0 wte0Var2 = (wte0) x;
                    ((zak0) wte0Var2.c).setValue(dVar);
                    ((zak0) wte0Var2.d).setValue(str);
                    ((zak0) wte0Var2.e).setValue(Boolean.valueOf(z));
                    ((zak0) wte0Var2.f).setValue(Boolean.valueOf(c));
                    ((zak0) wte0Var2.g).setValue(Boolean.valueOf(z3));
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    wte0Var2.j(48, aVar2, this.e, txj0.d(q630.a.a, 1.0f));
                    aVar2.j();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar2.h();
                }
                return s3q0.a;
        }
    }

    public /* synthetic */ ab00(gfp0.d dVar, boolean z, h17 h17Var, mtk0 mtk0Var, wh50 wh50Var, izs izsVar, mtk0 mtk0Var2) {
        this.f = dVar;
        this.c = z;
        this.g = h17Var;
        this.d = mtk0Var;
        this.h = wh50Var;
        this.e = izsVar;
        this.i = mtk0Var2;
    }
}
