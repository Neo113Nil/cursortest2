package xsna;

import android.net.Uri;
import android.widget.FrameLayout;
import com.huawei.hms.framework.common.BundleUtil;
import com.mbridge.msdk.MBridgeConstans;
import com.vk.dto.actionlinks.ActionLink;
import com.vk.dto.actionlinks.ActionLinkSnippet;
import com.vk.stat.scheme.CommonMarketStat$TypeRefSource;
import com.vkontakte.android.R;
import java.util.List;
import kotlin.Pair;
import ru.ok.android.utils.Logger;

/* compiled from: ItemActionLinkPresenter.kt */
/* loaded from: classes7.dex */
public final class ptx implements ntx {
    public gzs<s3q0> b;
    public gzs<s3q0> c;
    public final pxo0 d = new pxo0(1000);
    public FrameLayout e;
    public final bpn0 f;

    public ptx(bpn0 bpn0Var) {
        this.f = bpn0Var;
    }

    @Override // xsna.bux
    public final gzs<s3q0> H1() {
        return this.b;
    }

    @Override // xsna.bux
    public final gzs<s3q0> J0() {
        return this.c;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v26 */
    /* JADX WARN: Type inference failed for: r1v27 */
    /* JADX WARN: Type inference failed for: r1v3, types: [xsna.otx] */
    /* JADX WARN: Type inference failed for: r1v5, types: [xsna.cux] */
    /* JADX WARN: Type inference failed for: r1v8, types: [android.widget.FrameLayout] */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v18 */
    /* JADX WARN: Type inference failed for: r4v19 */
    /* JADX WARN: Type inference failed for: r4v3, types: [xsna.cux] */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [xsna.otx] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9, types: [xsna.otx] */
    /* JADX WARN: Type inference failed for: r6v14, types: [xsna.otx] */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v18, types: [xsna.otx] */
    /* JADX WARN: Type inference failed for: r6v19 */
    /* JADX WARN: Type inference failed for: r6v2, types: [xsna.otx] */
    /* JADX WARN: Type inference failed for: r6v23, types: [xsna.otx] */
    /* JADX WARN: Type inference failed for: r6v24 */
    /* JADX WARN: Type inference failed for: r6v28, types: [xsna.otx] */
    /* JADX WARN: Type inference failed for: r6v29 */
    /* JADX WARN: Type inference failed for: r6v33, types: [xsna.otx] */
    /* JADX WARN: Type inference failed for: r6v34 */
    /* JADX WARN: Type inference failed for: r6v38, types: [xsna.otx] */
    /* JADX WARN: Type inference failed for: r6v39 */
    /* JADX WARN: Type inference failed for: r6v43, types: [xsna.otx] */
    /* JADX WARN: Type inference failed for: r6v44 */
    /* JADX WARN: Type inference failed for: r6v48, types: [xsna.otx] */
    /* JADX WARN: Type inference failed for: r6v49 */
    /* JADX WARN: Type inference failed for: r6v50 */
    /* JADX WARN: Type inference failed for: r6v51 */
    /* JADX WARN: Type inference failed for: r6v52 */
    /* JADX WARN: Type inference failed for: r6v53 */
    /* JADX WARN: Type inference failed for: r6v54 */
    /* JADX WARN: Type inference failed for: r6v55 */
    /* JADX WARN: Type inference failed for: r6v56 */
    /* JADX WARN: Type inference failed for: r6v57 */
    /* JADX WARN: Type inference failed for: r6v58 */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Type inference failed for: r8v1, types: [xsna.otx] */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v6 */
    @Override // xsna.ntx
    public final void R5(ActionLink actionLink, int i, int i2, gzs<s3q0> gzsVar, gzs<s3q0> gzsVar2, boolean z, boolean z2, boolean z3) {
        Pair pair;
        String str = actionLink.c;
        ActionLinkSnippet actionLinkSnippet = actionLink.f;
        if (actionLinkSnippet != null) {
            String zb = actionLinkSnippet.zb();
            if (zb == null) {
                switch (str.hashCode()) {
                    case -732377866:
                        if (str.equals("article")) {
                            FrameLayout frameLayout = this.e;
                            ?? r6 = frameLayout;
                            if (frameLayout == null) {
                                r6 = 0;
                            }
                            r6.setPhotoPlaceholder(R.drawable.vk_icon_article_outline_28);
                            break;
                        }
                        break;
                    case -309474065:
                        if (str.equals("product")) {
                            FrameLayout frameLayout2 = this.e;
                            ?? r62 = frameLayout2;
                            if (frameLayout2 == null) {
                                r62 = 0;
                            }
                            r62.setPhotoPlaceholder(R.drawable.vk_icon_market_outline_28);
                            break;
                        }
                        break;
                    case 96801:
                        if (str.equals(MBridgeConstans.DYNAMIC_VIEW_WX_APP)) {
                            FrameLayout frameLayout3 = this.e;
                            ?? r63 = frameLayout3;
                            if (frameLayout3 == null) {
                                r63 = 0;
                            }
                            r63.setPhotoPlaceholder(R.drawable.vk_icon_services_outline_28);
                            break;
                        }
                        break;
                    case 3433103:
                        if (str.equals("page")) {
                            FrameLayout frameLayout4 = this.e;
                            ?? r64 = frameLayout4;
                            if (frameLayout4 == null) {
                                r64 = 0;
                            }
                            r64.setPhotoPlaceholder(R.drawable.vk_icon_link_outline_28);
                            break;
                        }
                        break;
                    case 3446719:
                        if (str.equals("poll")) {
                            FrameLayout frameLayout5 = this.e;
                            ?? r65 = frameLayout5;
                            if (frameLayout5 == null) {
                                r65 = 0;
                            }
                            r65.setPhotoPlaceholder(R.drawable.vk_icon_poll_square_outline_28);
                            break;
                        }
                        break;
                    case 3446944:
                        if (str.equals("post")) {
                            FrameLayout frameLayout6 = this.e;
                            ?? r66 = frameLayout6;
                            if (frameLayout6 == null) {
                                r66 = 0;
                            }
                            r66.setPhotoPlaceholder(R.drawable.vk_icon_newsfeed_36);
                            break;
                        }
                        break;
                    case 3599307:
                        if (str.equals("user")) {
                            FrameLayout frameLayout7 = this.e;
                            ?? r67 = frameLayout7;
                            if (frameLayout7 == null) {
                                r67 = 0;
                            }
                            r67.setPhotoPlaceholder(R.drawable.vk_icon_user_outline_28);
                            break;
                        }
                        break;
                    case 98629247:
                        if (str.equals("group")) {
                            FrameLayout frameLayout8 = this.e;
                            ?? r68 = frameLayout8;
                            if (frameLayout8 == null) {
                                r68 = 0;
                            }
                            r68.setPhotoPlaceholder(R.drawable.vk_icon_users_outline_28);
                            break;
                        }
                        break;
                }
            } else {
                FrameLayout frameLayout9 = this.e;
                ?? r8 = frameLayout9;
                if (frameLayout9 == null) {
                    r8 = 0;
                }
                r8.setLoadPhoto(zb);
            }
            FrameLayout frameLayout10 = this.e;
            ?? r69 = frameLayout10;
            if (frameLayout10 == null) {
                r69 = 0;
            }
            r69.z4(actionLinkSnippet.b, actionLinkSnippet.c, actionLinkSnippet.d);
            FrameLayout frameLayout11 = this.e;
            ?? r4 = frameLayout11;
            if (frameLayout11 == null) {
                r4 = 0;
            }
            r4.setActionVisibility(z);
            FrameLayout frameLayout12 = this.e;
            ?? r42 = frameLayout12;
            if (frameLayout12 == null) {
                r42 = 0;
            }
            r42.setActionLinkClicks(i);
            FrameLayout frameLayout13 = this.e;
            ?? r43 = frameLayout13;
            if (frameLayout13 == null) {
                r43 = 0;
            }
            r43.setActionLinkViews(i2);
            if (epx.f(str, "product")) {
                String queryParameter = Uri.parse(actionLink.e).getQueryParameter(Logger.METHOD_W);
                if (queryParameter == null || !drm0.D(queryParameter, "product", false)) {
                    pair = new Pair(null, null);
                } else {
                    List c0 = drm0.c0(brm0.y(queryParameter, "product", ""), new String[]{BundleUtil.UNDERLINE_TAG}, 0, 6);
                    pair = c0.size() < 2 ? new Pair(null, null) : new Pair(Long.valueOf(cqm0.l((String) c0.get(0))), Long.valueOf(cqm0.l((String) c0.get(1))));
                }
                Long l = (Long) pair.d();
                Long l2 = (Long) pair.g();
                if (l != null && l2 != null) {
                    lt00.h((lt00) this.f.getValue(), l2, l, null, CommonMarketStat$TypeRefSource.STREAM, null, null, null, null, 244);
                }
            }
        }
        FrameLayout frameLayout14 = this.e;
        ?? r1 = frameLayout14;
        if (frameLayout14 == null) {
            r1 = 0;
        }
        r1.setSelectionVisibility(z2);
        FrameLayout frameLayout15 = this.e;
        ?? r12 = frameLayout15;
        if (frameLayout15 == null) {
            r12 = 0;
        }
        r12.setActionVisibility(z);
        this.b = gzsVar;
        this.c = gzsVar2;
        ?? r13 = this.e;
        (r13 != 0 ? r13 : null).setItemClickEnabled(z3);
    }

    @Override // xsna.cc6
    public final void onDestroy() {
        throw null;
    }

    @Override // xsna.cc6
    public final void onPause() {
        throw null;
    }

    @Override // xsna.cc6
    public final void onResume() {
        throw null;
    }

    @Override // xsna.bux
    public final pxo0 q3() {
        return this.d;
    }
}
