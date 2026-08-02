package xsna;

import androidx.compose.runtime.a;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.defaults.ButtonSize;
import com.vkontakte.android.R;
import xsna.afo;
import xsna.efi;
import xsna.q630;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class cfi implements yzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ cfi(Object obj, Object obj2, Object obj3, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }

    @Override // xsna.yzs
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i;
        int i2;
        switch (this.b) {
            case 0:
                afo afoVar = (afo) this.c;
                z37 z37Var = (z37) this.d;
                dlv0 dlv0Var = (dlv0) this.e;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj2;
                int intValue = ((Integer) obj3).intValue();
                if (aVar.t(intValue & 1, (intValue & 17) != 16)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1318297105, intValue, -1, "com.vk.draftslist.impl.ui.ComposableSingletons$DraftsListFragmentKt.lambda$203071939.<anonymous>.<anonymous> (DraftsListFragment.kt:116)");
                    }
                    if (epx.f(afoVar, afo.d.b)) {
                        aVar.K(-131831192);
                        zeo.a(0, aVar);
                        aVar.j();
                    } else {
                        boolean f = epx.f(afoVar, afo.b.b);
                        a.C0011a.C0012a c0012a = a.C0011a.a;
                        if (f) {
                            aVar.K(-131828581);
                            boolean J = aVar.J(z37Var);
                            Object x = aVar.x();
                            if (J || x == c0012a) {
                                efi.b bVar = new efi.b(1, z37Var, z37.class, "send", "send(Lcom/vk/mvi/MviAction;)V", 0);
                                aVar.R(bVar);
                                x = bVar;
                            }
                            xeo.a((izs) ((fcy) x), aVar, 0);
                            aVar.j();
                        } else if (epx.f(afoVar, afo.c.b)) {
                            aVar.K(-131825381);
                            boolean J2 = aVar.J(z37Var);
                            Object x2 = aVar.x();
                            if (J2 || x2 == c0012a) {
                                efi.c cVar = new efi.c(1, z37Var, z37.class, "send", "send(Lcom/vk/mvi/MviAction;)V", 0);
                                aVar.R(cVar);
                                x2 = cVar;
                            }
                            yeo.a((izs) ((fcy) x2), aVar, 0);
                            aVar.j();
                        } else {
                            if (afoVar instanceof afo.a) {
                                aVar.K(208487499);
                                afo.a aVar2 = (afo.a) afoVar;
                                boolean J3 = aVar.J(z37Var);
                                Object x3 = aVar.x();
                                if (J3 || x3 == c0012a) {
                                    efi.d dVar = new efi.d(1, z37Var, z37.class, "send", "send(Lcom/vk/mvi/MviAction;)V", 0);
                                    aVar.R(dVar);
                                    x3 = dVar;
                                }
                                weo.g(aVar2, dlv0Var, (izs) ((fcy) x3), aVar, 48);
                            } else {
                                aVar.K(203547153);
                            }
                            aVar.j();
                        }
                    }
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                break;
            default:
                q630 q630Var = (q630) this.c;
                l050 l050Var = (l050) this.d;
                rg50 rg50Var = (rg50) this.e;
                androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                if (aVar3.t(intValue2 & 1, (intValue2 & 17) != 16)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-311801008, intValue2, -1, "com.vk.music.playlist.display.presentation.MixButton.<anonymous> (MusicPlaylistHeaderButtonsWithMix.kt:376)");
                    }
                    jk2.a(R.raw.music_note_wave_outline_20, s050.j(aVar3), txj0.q(q630Var, hr80.z().v(ButtonSize.Medium, aVar3, 6)), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, Integer.valueOf(rg50Var.getIntValue()), null, false, aVar3, 196608, 72);
                    hr80.z().getClass();
                    op8.h();
                    f9t.e(txj0.v(q630.a.a, kqu0.s), aVar3, 0);
                    if (l050Var.j) {
                        i = 1150867317;
                        i2 = R.string.music_mix_by_album_title;
                    } else {
                        i = 1150965618;
                        i2 = R.string.music_mix_by_playlist_title;
                    }
                    String a = zq.a(aVar3, i, i2, aVar3, 0);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
                    }
                    wuv0 wuv0Var = (wuv0) aVar3.r(rrv0.c);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    yqv0.c(a, null, 0L, null, null, 0, 0, null, 2, false, 0, 1, null, wuv0Var.O, aVar3, 100663296, 48, 5886);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar3.h();
                }
                break;
        }
        return s3q0.a;
    }
}
