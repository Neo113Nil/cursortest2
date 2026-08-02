package xsna;

import android.content.Context;
import android.graphics.Path;
import com.vk.camera.clips.api.stub.CameraClipsComponentStub;
import com.vk.catalog2.feature.music.holders.MusicTrackCellVh;
import com.vk.clips.internal.nps.impl.di.ClipsInternalNpsComponentImpl;
import com.vk.clips.viewer.impl.di.ClipsViewerComponentImpl;
import com.vk.content.pivacy.di.ContentPrivacyComponentImpl;
import com.vk.draftslist.impl.di.DraftsListComponentImpl;
import com.vk.ecomm.configureitemlist.di.ConfigureItemListComponentImpl;
import com.vk.ecomm.moderation.impl.restrictions.di.ModerationComponentImpl;
import com.vk.newsfeed.impl.postmodal.comments.CommentsOutherFragment;
import com.vk.stickers.bonus.catalog.BonusCatalogFragment;
import com.vk.toggle.features.ComFeatures;
import com.vk.voip.OKVoipEngine;
import com.vkontakte.android.R;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Set;
import kotlin.text.Regex;
import xsna.gk0;
import xsna.j1d0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class w9 implements gzs {
    public final /* synthetic */ int b;

    public /* synthetic */ w9(int i) {
        this.b = i;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols();
                decimalFormatSymbols.setGroupingSeparator(' ');
                return new DecimalFormat("###,###", decimalFormatSymbols);
            case 1:
                return new gk0.b();
            case 2:
                return s3q0.a;
            case 3:
                int i = BonusCatalogFragment.f0;
                return com.vk.movika.sdk.base.model.n.a(12.0f);
            case 4:
                qcy<Object>[] qcyVarArr = CameraClipsComponentStub.h;
                return new yke();
            case 5:
                qcy<Object>[] qcyVarArr2 = ClipsInternalNpsComponentImpl.g;
                return new yjx();
            case 6:
                qcy<Object>[] qcyVarArr3 = ClipsViewerComponentImpl.o0;
                return new lof();
            case 7:
                int i2 = CommentsOutherFragment.h0;
                return new jgg();
            case 8:
                ComFeatures comFeatures = ComFeatures.COM_NEW_MENU;
                comFeatures.getClass();
                return Boolean.valueOf(com.vk.toggle.b.A.a(comFeatures));
            case 9:
                qcy<Object>[] qcyVarArr4 = ConfigureItemListComponentImpl.b;
                return new c0j();
            case 10:
                qcy<Object>[] qcyVarArr5 = ContentPrivacyComponentImpl.c;
                return new wij();
            case 11:
                qcy<Object>[] qcyVarArr6 = DraftsListComponentImpl.b;
                return new geo();
            case 12:
                return new hsm();
            case 13:
                return lar.c.getString(R.string.fsize_kb);
            case 14:
                return s3q0.a;
            case 15:
                return new io.reactivex.rxjava3.disposables.b();
            case 16:
                Path path = new Path();
                path.moveTo(5.36606f, 1.49977f);
                path.cubicTo(5.20072f, 0.828129f, 5.11805f, 0.49231f, 5.0788f, 0.452121f);
                path.cubicTo(4.9893804f, 0.360569f, 4.8728004f, 0.360696f, 4.7835903f, 0.452443f);
                path.cubicTo(4.7444305f, 0.492718f, 4.6624804f, 0.828756f, 4.4985905f, 1.50083f);
                path.cubicTo(4.2881303f, 2.36385f, 3.9994204f, 3.21619f, 3.6299605f, 3.58575f);
                path.cubicTo(3.2604606f, 3.9553502f, 2.4069405f, 4.2442f, 1.5425906f, 4.45477f);
                path.cubicTo(0.8695466f, 4.61874f, 0.53302765f, 4.7007203f, 0.49273968f, 4.73988f);
                path.cubicTo(0.40096968f, 4.8291f, 0.40084967f, 4.94574f, 0.49243468f, 5.03514f);
                path.cubicTo(0.53264266f, 5.07439f, 0.86895466f, 5.15706f, 1.5415807f, 5.32239f);
                path.cubicTo(2.4062808f, 5.5349402f, 3.2603207f, 5.82556f, 3.6299608f, 6.1953f);
                path.cubicTo(3.9996607f, 6.5651f, 4.288561f, 7.41401f, 4.4991307f, 8.272631f);
                path.cubicTo(4.662891f, 8.940391f, 4.7447705f, 9.274271f, 4.783921f, 9.314481f);
                path.cubicTo(4.873161f, 9.406091f, 4.989501f, 9.406211f, 5.078921f, 9.314781f);
                path.cubicTo(5.1181607f, 9.274652f, 5.200711f, 8.940981f, 5.365811f, 8.273622f);
                path.cubicTo(5.578311f, 7.4146614f, 5.868951f, 6.565242f, 6.238791f, 6.1953015f);
                path.cubicTo(6.608981f, 5.8250117f, 7.458651f, 5.5316215f, 8.317321f, 5.3161516f);
                path.cubicTo(8.982981f, 5.1491218f, 9.315811f, 5.065602f, 9.355801f, 5.026242f);
                path.cubicTo(9.44694f, 4.9365416f, 9.44647f, 4.820262f, 9.35461f, 4.731302f);
                path.cubicTo(9.314301f, 4.6922717f, 8.980651f, 4.6114116f, 8.31336f, 4.449712f);
                path.cubicTo(7.4560404f, 4.241952f, 6.6084104f, 3.9554718f, 6.2387905f, 3.5857518f);
                path.cubicTo(5.8691807f, 3.2160418f, 5.5786004f, 2.3631418f, 5.3660603f, 1.4997718f);
                path.close();
                path.moveTo(5.36606f, 1.49977f);
                return path;
            case 17:
                return "#doClearCache starting...";
            case 18:
                return new Regex("/moneysend/([A-Za-z0-9._/]+)$");
            case 19:
                return new i1t0(true, bo.h());
            case 20:
                qcy<Object>[] qcyVarArr7 = ModerationComponentImpl.g;
                return new n530();
            case 21:
                Set<String> set = MusicTrackCellVh.A;
                return lyd.g();
            case 22:
                zhs b = com.vk.toggle.d.h.b();
                if (b == null) {
                    b = new zhs(600000L);
                }
                return Long.valueOf(b.a);
            case 23:
                cnw0 cnw0Var = OKVoipEngine.v;
                if (cnw0Var == null) {
                    cnw0Var = null;
                }
                cnw0Var.getClass();
                Context context = e43.a;
                if (context != null) {
                    return context;
                }
                return null;
            case 24:
                return new j1d0.b(1000L);
            case 25:
                return new StringBuilder();
            case 26:
                return new float[2];
            case 27:
                return new a6a0();
            case 28:
                return s3q0.a;
            default:
                int i3 = com.vk.clips.sdk.shared.item.static_ads.c.F;
                return Integer.valueOf(R.layout.fullscreen_static_ads_item_controls_redesign);
        }
    }
}
