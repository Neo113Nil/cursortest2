package xsna;

import android.content.Context;
import com.vk.api.generated.adsint.dto.AdsintEventTypeDto;
import com.vk.catalog2.common.ui.core.view.CatalogRecyclerPaginatedView;
import com.vk.clips.viewer.impl.feed.wrapper.ui.fragment.ClipsWrapperFragment;
import com.vk.geo.impl.presentation.GeoDataSet;
import com.vk.media.pipeline.gl.codec.handler.dto.colorinfo.ColorRange;
import com.vk.media.pipeline.gl.codec.handler.dto.colorinfo.ColorSpace;
import com.vk.media.pipeline.gl.codec.handler.dto.colorinfo.ColorTransfer;
import com.vk.music.offline.configs.impl.di.AudioRestrictionComponentImpl;
import com.vk.music.offline.core.database.OfflineAudioDatabase;
import com.vk.network.eventhub.impl.di.EventHubComponentImpl;
import com.vk.preview.di.GalleryPickerPreviewComponentImpl;
import com.vk.toggle.features.FeedFeatures;
import com.vk.toggle.features.SoccomFeatures;
import com.vkontakte.android.R;
import java.util.Collections;
import java.util.List;
import kotlin.Pair;
import xsna.bbv0;
import xsna.ibq0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes14.dex */
public final /* synthetic */ class gu0 implements gzs {
    public final /* synthetic */ int b;

    public /* synthetic */ gu0(int i) {
        this.b = i;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        dbq0 dbq0Var = null;
        switch (this.b) {
            case 0:
                return Collections.singleton(new Pair(AdsintEventTypeDto.MRC_IMPRESSION_PRETTY_CARD, AdsintEventTypeDto.MRC_IMPRESSION));
            case 1:
                qcy<Object>[] qcyVarArr = AudioRestrictionComponentImpl.c;
                ix4 ix4Var = new ix4();
                Context context = e43.a;
                if (context == null) {
                    context = null;
                }
                gw4 A = OfflineAudioDatabase.j.a(context).A();
                jw4 jw4Var = new jw4();
                iv10 iv10Var = new iv10();
                Context context2 = e43.a;
                return new ww4(ix4Var, A, jw4Var, iv10Var, context2 != null ? context2 : null);
            case 2:
                bbv0.g.getClass();
                bbv0.a.f().d.c();
                return s3q0.a;
            case 3:
                int i = CatalogRecyclerPaginatedView.Q;
                return s3q0.a;
            case 4:
                return s3q0.a;
            case 5:
                return s3q0.a;
            case 6:
                return new a390();
            case 7:
                return new nbd();
            case 8:
                int i2 = ClipsWrapperFragment.Q0;
                return new osf();
            case 9:
                ColorSpace colorSpace = ColorSpace.COLOR_SPACE_BT709;
                ColorRange colorRange = ColorRange.COLOR_RANGE_LIMITED;
                return new n6g(colorSpace, ColorTransfer.COLOR_TRANSFER_SDR);
            case 10:
                return s3q0.a;
            case 11:
                return s3q0.a;
            case 12:
                Context context3 = e43.a;
                if (context3 == null) {
                    context3 = null;
                }
                return Integer.valueOf(context3.getResources().getColor(R.color.vk_steel_gray_150, null));
            case 13:
                return new lu();
            case 14:
                qcy<Object>[] qcyVarArr2 = EventHubComponentImpl.e;
                return com.vk.network.eventhub.impl.c.a;
            case 15:
                up70 up70Var = u8r.d;
                if (up70Var == null) {
                    up70Var = null;
                }
                up70Var.o("FileEventStorage", new y84(5));
                ibq0 ibq0Var = u8r.g;
                if (ibq0Var == null) {
                    ibq0Var = null;
                }
                synchronized (ibq0Var.d) {
                    try {
                        ibq0Var.c.o("UploadFileSendQueue", new dgc0(12));
                        ibq0.a peek = ibq0Var.d.peek();
                        if (peek != null) {
                            long j = peek.b;
                            ibq0Var.b.getClass();
                            if (j <= System.currentTimeMillis()) {
                                ibq0Var.d.remove(peek);
                                dbq0Var = peek.e;
                            }
                        }
                        ibq0Var.c.o("UploadFileSendQueue", new stg0(dbq0Var, 15));
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return dbq0Var;
            case 16:
                qcy<Object>[] qcyVarArr3 = GalleryPickerPreviewComponentImpl.e;
                return new f9f();
            case 17:
                return new d370(27);
            case 18:
                return GeoDataSet.Type.FEED;
            case 19:
                return new env0();
            case 20:
                SoccomFeatures soccomFeatures = SoccomFeatures.MULTI_INTEGRATION;
                soccomFeatures.getClass();
                return Boolean.valueOf(com.vk.toggle.b.A.a(soccomFeatures));
            case 21:
                return Boolean.valueOf(com.vk.toggle.d.Q());
            case 22:
                pqo pqoVar = pvz.a;
                return null;
            case 23:
                List<Integer> list = a500.z;
                return "stop thread, drop cache exception";
            case 24:
                return s3q0.a;
            case 25:
                return s3q0.a;
            case 26:
                return s3q0.a;
            case 27:
                FeedFeatures feedFeatures = FeedFeatures.FRESH_NEWS_LOADER_FIX;
                feedFeatures.getClass();
                return Boolean.valueOf(com.vk.toggle.b.A.a(feedFeatures));
            case 28:
                return new axj0(new sd9(), new s1v());
            default:
                return new ho10();
        }
    }
}
