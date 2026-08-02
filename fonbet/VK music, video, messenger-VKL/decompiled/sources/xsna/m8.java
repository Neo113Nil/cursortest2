package xsna;

import android.content.Context;
import android.widget.TextView;
import com.vk.api.generated.apps.dto.AppsSearchResponseDto;
import com.vk.core.view.links.LinkedTextView;
import com.vk.dto.common.VideoFile;
import com.vk.geo.impl.model.BoundingBox;
import com.vk.search.ui.api.SearchInputMethod;
import com.vk.search.ui.api.SearchQuery;
import com.vkontakte.android.R;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.ok.android.utils.Logger;
import xsna.kh80;
import xsna.xn50;

/* compiled from: AboutVideoItemsLoader.kt */
/* loaded from: classes2.dex */
public final /* synthetic */ class m8 extends FunctionReferenceImpl implements izs {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m8(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, obj, cls, str, str2, i2);
        this.b = i3;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                return t8.a((t8) this.receiver, (hfz) obj);
            case 1:
                com.vk.profile.core.scheduled_clips.h hVar = (com.vk.profile.core.scheduled_clips.h) this.receiver;
                hVar.i.setContent(new jai(625736787, new qed(3, (r0i) obj, hVar), true));
                return s3q0.a;
            case 2:
                com.vk.im.ui.components.viewcontrollers.dialog_header.info.b bVar = (com.vk.im.ui.components.viewcontrollers.dialog_header.info.b) this.receiver;
                int i = com.vk.im.ui.components.viewcontrollers.dialog_header.info.b.O;
                bVar.C((u8m) obj);
                return s3q0.a;
            case 3:
                return ((q73) this.receiver).g((AppsSearchResponseDto) obj);
            case 4:
                com.vk.geo.impl.presentation.b bVar2 = (com.vk.geo.impl.presentation.b) this.receiver;
                qcy<Object>[] qcyVarArr = com.vk.geo.impl.presentation.b.H;
                return Float.valueOf(bVar2.V((BoundingBox) obj));
            case 5:
                xh80 xh80Var = (xh80) obj;
                kh80 kh80Var = (kh80) this.receiver;
                LinkedTextView linkedTextView = kh80Var.i;
                TextView textView = kh80Var.h;
                Context context = kh80Var.b;
                bwt0.i0(kh80Var.j, new v53(20, kh80Var, xh80Var));
                bwt0.i0(kh80Var.k, new defpackage.b0(24, kh80Var, xh80Var));
                int i2 = kh80.a.$EnumSwitchMapping$0[xh80Var.b.b.ordinal()];
                if (i2 == 1) {
                    textView.setText(context.getString(R.string.music_onboarding_new_user_scenario_title_ca1));
                    linkedTextView.setText(context.getString(R.string.music_onboarding_new_user_scenario_description_ca1));
                } else if (i2 == 2) {
                    textView.setText(context.getString(R.string.music_onboarding_old_user_scenario_title_ca3));
                    linkedTextView.setText(context.getString(R.string.music_onboarding_old_user_scenario_description_ca3));
                }
                bwt0.p0(kh80Var.g, true);
                return s3q0.a;
            case 6:
                ((kt70) this.receiver).getClass();
                return ((evk) obj).a.toString();
            case 7:
                SearchQuery searchQuery = (SearchQuery) obj;
                xz70 xz70Var = (xz70) this.receiver;
                z1h0 z1h0Var = xz70Var.a;
                if (z1h0Var instanceof vxh0) {
                    vxh0 vxh0Var = (vxh0) z1h0Var;
                    String str = searchQuery.b;
                    SearchInputMethod searchInputMethod = searchQuery.c;
                    if (searchInputMethod == null) {
                        searchInputMethod = SearchInputMethod.Keyboard;
                    }
                    vxh0Var.O(str, searchInputMethod);
                } else {
                    xz70Var.a(searchQuery);
                }
                return s3q0.a;
            case 8:
                ((xgx0) this.receiver).getClass();
                xgx0.d((Throwable) obj);
                return s3q0.a;
            case 9:
                ((gwa0) this.receiver).d((wfs) obj);
                return s3q0.a;
            case 10:
                cfd0 cfd0Var = (cfd0) this.receiver;
                cfd0Var.getClass();
                xn50.a.c(cfd0Var, (wed0) obj);
                return s3q0.a;
            case 11:
                ((p4n0) this.receiver).a((a5n0) obj);
                return s3q0.a;
            default:
                ((pkt0) this.receiver).getClass();
                return pkt0.a((VideoFile) obj);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m8(Object obj, int i) {
        super(1, obj, com.vk.profile.core.scheduled_clips.h.class, "updateOverlayState", "updateOverlayState(Lcom/vk/profile/core/scheduled_clips/overlay/CommunityScheduledClipsGridOverlayState;)V", 0);
        this.b = i;
        switch (i) {
            case 4:
                super(1, obj, com.vk.geo.impl.presentation.b.class, "calculateMetersPerPx", "calculateMetersPerPx(Lcom/vk/geo/impl/model/BoundingBox;)F", 0);
                break;
            case 8:
                super(1, obj, xgx0.class, Logger.METHOD_E, "e(Ljava/lang/Throwable;)V", 0);
                break;
            case 12:
                super(1, obj, pkt0.class, "map", "map(Lcom/vk/dto/common/VideoFile;)Lcom/vk/newsfeed/api/data/VideoStatistic;", 0);
                break;
            default:
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m8(kt70 kt70Var) {
        super(1, kt70Var, kt70.class, "buildV2Key", "buildV2Key(Landroidx/media3/datasource/DataSpec;)Ljava/lang/String;", 0);
        this.b = 6;
    }
}
