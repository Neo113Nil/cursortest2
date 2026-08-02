package xsna;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import com.vk.api.generated.likes.dto.LikesAddResponseDto;
import com.vk.dto.group.AdminLeaveAction;
import com.vk.dto.group.Group;
import com.vk.dto.group.GroupSuggestion;
import com.vk.dto.music.MusicTrack;
import com.vk.ecomm.reviews.impl.communities.reviews.presentation.feature.c;
import com.vk.ecomm.reviews.impl.communities.reviews.presentation.feature.e;
import com.vk.music.common.MusicPlaybackLaunchContext;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.Ref$ObjectRef;
import xsna.bbv0;
import xsna.gku0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class wyh implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ wyh(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                LinkedHashMap linkedHashMap = (LinkedHashMap) this.c;
                c.l lVar = (c.l) this.d;
                txh txhVar = (txh) this.e;
                com.vk.ecomm.reviews.impl.communities.reviews.presentation.feature.d dVar = (com.vk.ecomm.reviews.impl.communities.reviews.presentation.feature.d) this.f;
                linkedHashMap.put(Integer.valueOf(lVar.b), txh.a(txhVar, ((LikesAddResponseDto) obj).l1(), true, false, false, null, false, 2097055));
                dVar.T(new e.s(linkedHashMap));
                break;
            case 1:
                Ref$ObjectRef ref$ObjectRef = (Ref$ObjectRef) this.c;
                brj0 brj0Var = (brj0) this.d;
                ihr ihrVar = (ihr) this.e;
                brj0 brj0Var2 = (brj0) this.f;
                brj0 brj0Var3 = (brj0) obj;
                dw20 dw20Var = (dw20) ref$ObjectRef.element;
                if (dw20Var != null) {
                    dw20Var.dismiss();
                }
                int i = brj0Var3.a;
                if (i == brj0Var.a) {
                    ihrVar.a.invoke();
                } else if (i == brj0Var2.a) {
                    ihrVar.b.invoke(Boolean.FALSE);
                }
                break;
            case 2:
                l7v l7vVar = (l7v) this.c;
                View view = (View) this.d;
                String str = (String) this.e;
                h7v.t(l7vVar, view, str, null, new svd(l7vVar, str, (gzs) this.f, 5), 12);
                break;
            case 3:
                g0z g0zVar = (g0z) this.c;
                String str2 = (String) this.d;
                Bundle bundle = (Bundle) this.e;
                MusicPlaybackLaunchContext musicPlaybackLaunchContext = (MusicPlaybackLaunchContext) this.f;
                List<MusicTrack> list = (List) obj;
                MusicTrack musicTrack = (MusicTrack) j5g.a0(list);
                bn40.f("Artist's popular successfully loaded");
                g0zVar.f(str2, list, bundle);
                g0zVar.g(musicTrack, list, musicPlaybackLaunchContext, bundle);
                break;
            case 4:
                ((q3n0) this.c).a((GroupSuggestion) this.d, (Group) this.e, (AdminLeaveAction) obj, (io.reactivex.rxjava3.disposables.g) this.f);
                break;
            default:
                gbv0 gbv0Var = (gbv0) this.c;
                ebv0 ebv0Var = (ebv0) this.d;
                shn0 shn0Var = (shn0) this.e;
                FragmentManager fragmentManager = (FragmentManager) this.f;
                if (!((Boolean) obj).booleanValue()) {
                    gbv0Var.m(gku0.c.b);
                    break;
                } else {
                    bbv0.a aVar = bbv0.g;
                    akd0 akd0Var = new akd0(gbv0Var, 26);
                    aVar.getClass();
                    ebv0Var.G = new juw0(1, shn0Var, akd0Var);
                    if (fragmentManager != null) {
                        ebv0Var.Td(fragmentManager, null);
                    }
                    break;
                }
        }
        return s3q0.a;
    }
}
