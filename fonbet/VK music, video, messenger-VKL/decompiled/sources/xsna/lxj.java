package xsna;

import com.vk.dto.common.ClipStatStoryData;
import com.vk.dto.newsfeed.Owner;
import com.vk.dto.shortvideo.ClipsAuthor;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.MobileOfficialAppsStoriesStat$TypeStoryPublishItem;
import com.vk.superapp.base.js.bridge.VkUiView;
import com.vk.superapp.vkclient.js.bridge.api.events.JoinGroup$Parameters;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class lxj implements gzs {
    public final /* synthetic */ int b = 1;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ lxj(long j, JoinGroup$Parameters joinGroup$Parameters, String str, x7y x7yVar) {
        this.d = x7yVar;
        this.c = j;
        this.e = joinGroup$Parameters;
        this.f = str;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        VkUiView view;
        io.reactivex.rxjava3.disposables.b D6;
        switch (this.b) {
            case 0:
                nxj nxjVar = (nxj) this.d;
                ClipStatStoryData.Type type = (ClipStatStoryData.Type) this.e;
                ClipsAuthor clipsAuthor = (ClipsAuthor) this.f;
                dw20 dw20Var = nxjVar.c;
                if (dw20Var != null) {
                    dw20Var.dismiss();
                }
                pkd f = g620.f();
                bc6 L = xa4.L(e3m.h(nxjVar.b));
                MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen = MobileOfficialAppsCoreNavStat$EventScreen.CLIP_GRID;
                MobileOfficialAppsStoriesStat$TypeStoryPublishItem.CreationEntryPoint creationEntryPoint = MobileOfficialAppsStoriesStat$TypeStoryPublishItem.CreationEntryPoint.CLIPS_COUNTER_STATS;
                Owner owner = clipsAuthor.b;
                f.q(L, mobileOfficialAppsCoreNavStat$EventScreen, creationEntryPoint, new ClipStatStoryData(type, this.c, owner.b, owner.c, owner.e));
                break;
            default:
                x7y x7yVar = (x7y) this.d;
                JoinGroup$Parameters joinGroup$Parameters = (JoinGroup$Parameters) this.e;
                String str = (String) this.f;
                xwv0 xwv0Var = x7yVar.d;
                if (xwv0Var != null && (view = xwv0Var.getView()) != null && (D6 = view.D6()) != null) {
                    vdx0 vdx0Var = e370.e;
                    if (vdx0Var == null) {
                        vdx0Var = null;
                    }
                    hfn0 j = vdx0Var.j();
                    wdx0 wdx0Var = e370.f;
                    long i = (wdx0Var != null ? wdx0Var : null).i();
                    long j2 = this.c;
                    D6.b(j.a(j2, i).subscribe(new hms(new v7y(j2, joinGroup$Parameters, str, x7yVar), 7), new pf1(new s62(x7yVar, joinGroup$Parameters, str), 24)));
                }
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ lxj(nxj nxjVar, ClipStatStoryData.Type type, long j, ClipsAuthor clipsAuthor) {
        this.d = nxjVar;
        this.e = type;
        this.c = j;
        this.f = clipsAuthor;
    }
}
