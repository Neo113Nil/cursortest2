package xsna;

import android.widget.TextView;
import com.vk.catalog2.common.ui.holders.search.SearchResultsVh;
import com.vk.catalog2.common.ui.mvp.holder.header.AnimSearchQueryVh;
import com.vk.catalog2.common.ui.mvp.holder.search.SearchResultsImplVh;
import com.vk.catalog2.feature.music.ui.holder.MusicCatalogRootVh;
import com.vk.core.view.ProgressButton;
import com.vk.core.view.search.AnimStartSearchView;
import com.vk.dto.common.id.UserId;
import com.vk.dto.user.RequestUserProfile;
import com.vk.ecomm.api.analytics.MarketAnalyticsParams;
import com.vk.ecomm.catalog.impl.catalog.root.ClassifiedsCatalogRootVh;
import com.vk.libvideo.design.view.videotexture.VideoTextureView;
import com.vk.search.ui.api.SearchInputMethod;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.t24;

/* compiled from: AttachMusicTopBarController.kt */
/* loaded from: classes3.dex */
public final /* synthetic */ class a34 extends FunctionReferenceImpl implements gzs {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a34(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, obj, cls, str, str2, i2);
        this.b = i3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.gzs
    public final Object invoke() {
        String str;
        String query;
        AnimStartSearchView animStartSearchView;
        int i;
        switch (this.b) {
            case 0:
                t24.e eVar = ((x24) this.receiver).d;
                if (eVar != null) {
                    eVar.onClick();
                }
                return s3q0.a;
            case 1:
                ClassifiedsCatalogRootVh classifiedsCatalogRootVh = (ClassifiedsCatalogRootVh) this.receiver;
                AnimSearchQueryVh animSearchQueryVh = classifiedsCatalogRootVh.b0;
                classifiedsCatalogRootVh.i8(vyh0.a);
                MarketAnalyticsParams marketAnalyticsParams = classifiedsCatalogRootVh.y;
                if (marketAnalyticsParams != null && marketAnalyticsParams.k && !classifiedsCatalogRootVh.U) {
                    yfc yfcVar = classifiedsCatalogRootVh.K;
                    UserId c = yfcVar != null ? yfcVar.c() : null;
                    String str2 = marketAnalyticsParams.h;
                    if (c != null && str2 != null) {
                        mt00.g(Long.valueOf(c.b), marketAnalyticsParams.d, str2);
                    }
                }
                classifiedsCatalogRootVh.U = false;
                SearchResultsImplVh searchResultsImplVh = classifiedsCatalogRootVh.a0;
                AnimStartSearchView animStartSearchView2 = classifiedsCatalogRootVh.b0.g;
                if (animStartSearchView2 == null || (str = animStartSearchView2.getQuery()) == null) {
                    str = "";
                }
                SearchResultsVh.cb(searchResultsImplVh, str, classifiedsCatalogRootVh.X, null, false, SearchInputMethod.Keyboard, false, 44);
                AnimStartSearchView animStartSearchView3 = animSearchQueryVh.g;
                if (animStartSearchView3 != null && (query = animStartSearchView3.getQuery()) != null && query.length() > 0 && (animStartSearchView = animSearchQueryVh.g) != null) {
                    animStartSearchView.post(new xab(classifiedsCatalogRootVh, 1));
                }
                return s3q0.a;
            case 2:
                ((xuo) this.receiver).c();
                return s3q0.a;
            case 3:
                ajs ajsVar = (ajs) this.receiver;
                ProgressButton progressButton = ajsVar.C;
                TextView textView = ajsVar.F;
                ajsVar.itemView.setForeground(null);
                ajsVar.q6().q = true;
                ajsVar.D.setVisibility(ajsVar.I ? 0 : 8);
                ajsVar.E.setVisibility(8);
                if (epx.f(((RequestUserProfile) ajsVar.m).c, ajsVar.G) || (i = ((RequestUserProfile) ajsVar.m).v) == 1 || i == 3) {
                    progressButton.setVisibility(8);
                    textView.setVisibility(0);
                    textView.setEnabled(((RequestUserProfile) ajsVar.m).d());
                } else {
                    progressButton.setVisibility(0);
                    textView.setVisibility(8);
                }
                if (ajsVar.H) {
                    ajsVar.itemView.requestLayout();
                }
                return s3q0.a;
            case 4:
                ((MusicCatalogRootVh) this.receiver).getClass();
                return Boolean.valueOf(com.vk.toggle.d.K());
            case 5:
                return Boolean.valueOf(((g950) this.receiver).c());
            default:
                return Boolean.valueOf(((VideoTextureView) this.receiver).g());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a34(Object obj, int i) {
        super(0, obj, x24.class, "onLeftButtonClick", "onLeftButtonClick()V", 0);
        this.b = i;
        switch (i) {
            case 2:
                super(0, obj, xuo.class, "update", "update()V", 0);
                break;
            case 3:
            default:
                break;
            case 4:
                super(0, obj, MusicCatalogRootVh.class, "isObjectSearchHistoryEnabled", "isObjectSearchHistoryEnabled()Z", 0);
                break;
            case 5:
                super(0, obj, g950.class, "hasMusicSubscriptionForOffline", "hasMusicSubscriptionForOffline()Z", 0);
                break;
        }
    }
}
