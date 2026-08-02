package xsna;

import android.content.Context;
import com.vk.clips.design.view.component.user.ClipUserView;
import com.vk.clips.sdk.models.ImageUrl;
import com.vk.clips.sdk.models.SdkCoOwnerItem;
import com.vk.clips.sdk.models.SdkImages;
import com.vk.clips.sdk.models.SdkOwner;
import com.vk.clips.sdk.shared.item.clip.viewstate.MainOverlayState;
import com.vk.clips.sdk.shared.viewer.experiments.models.ClipsMarketAdHeaderClickConfig;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import xsna.e3m;
import xsna.tlo0;
import xsna.x590;

/* compiled from: OwnerRenderDelegate.kt */
/* loaded from: classes17.dex */
public final class j590 {
    public final ClipUserView a;
    public final ClipsMarketAdHeaderClickConfig b;
    public x590 c;

    /* compiled from: OwnerRenderDelegate.kt */
    public static final class a implements ClipUserView.b {
        public final SdkOwner a;
        public final String b;

        public a(SdkOwner sdkOwner, String str) {
            this.a = sdkOwner;
            this.b = str;
        }

        @Override // com.vk.clips.design.view.component.user.ClipUserView.b
        public final hdu0 d() {
            SdkOwner sdkOwner = this.a;
            if (sdkOwner == null || !sdkOwner.q) {
                return null;
            }
            return new ndu0();
        }

        @Override // com.vk.clips.design.view.component.user.ClipUserView.b
        public final String e(int i) {
            SdkImages sdkImages;
            ImageUrl b;
            String str = this.b;
            if (str != null) {
                return str;
            }
            SdkOwner sdkOwner = this.a;
            if (sdkOwner == null || (sdkImages = sdkOwner.d) == null || (b = sdkImages.b(i)) == null) {
                return null;
            }
            return b.b;
        }
    }

    public j590(ClipUserView clipUserView, ClipsMarketAdHeaderClickConfig clipsMarketAdHeaderClickConfig) {
        this.a = clipUserView;
        this.b = clipsMarketAdHeaderClickConfig;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ed  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(x590 x590Var, MainOverlayState.PublicationDateState publicationDateState) {
        tlo0.h d;
        x590.b bVar;
        k590 k590Var;
        x590.d dVar;
        baf0 baf0Var;
        ClipUserView clipUserView = this.a;
        ClipsMarketAdHeaderClickConfig clipsMarketAdHeaderClickConfig = this.b;
        if (clipsMarketAdHeaderClickConfig != null && clipsMarketAdHeaderClickConfig.b == ClipsMarketAdHeaderClickConfig.HeaderType.HIDDEN && clipsMarketAdHeaderClickConfig.a) {
            if (clipUserView.getVisibility() == 0) {
                f4m.j(clipUserView);
                return;
            }
            return;
        }
        if (x590Var.equals(this.c)) {
            return;
        }
        if (x590Var.f) {
            d3m.e(this.a, (r15 & 1) != 0 ? 300L : 0L, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? false : false);
        } else {
            clipUserView.setVisibility(0);
            x590.a aVar = x590Var.a;
            if (aVar instanceof x590.a.c) {
                x590.a.c cVar = (x590.a.c) aVar;
                clipUserView.setBefore(new ClipUserView.a.C0573a(new a(cVar.a, cVar.b)));
            } else if (aVar instanceof x590.a.C3974a) {
                x590.a.C3974a c3974a = (x590.a.C3974a) aVar;
                List singletonList = Collections.singletonList(c3974a.a);
                List<SdkCoOwnerItem> list = c3974a.b;
                ArrayList arrayList = new ArrayList(c5g.u(list, 10));
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(((SdkCoOwnerItem) it.next()).c);
                }
                ArrayList u0 = j5g.u0(arrayList, singletonList);
                ArrayList arrayList2 = new ArrayList();
                Iterator it2 = u0.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(new a((SdkOwner) it2.next(), null));
                }
                clipUserView.setBefore(new ClipUserView.a.b(arrayList2, 2));
            } else {
                if (!(aVar instanceof x590.a.b)) {
                    throw new NoWhenBranchMatchedException();
                }
                clipUserView.setBefore(null);
            }
            ClipUserView.c.a.b bVar2 = new ClipUserView.c.a.b(2, x590Var.b);
            if (!(publicationDateState instanceof MainOverlayState.PublicationDateState.a)) {
                if (publicationDateState instanceof MainOverlayState.PublicationDateState.Visible) {
                    MainOverlayState.PublicationDateState.Visible visible = (MainOverlayState.PublicationDateState.Visible) publicationDateState;
                    if (visible.b == MainOverlayState.PublicationDateState.Visible.Alignment.Vertical) {
                        d = oq.d(tlo0.Companion, visible.a);
                        bVar = x590Var.c;
                        if (!(bVar instanceof x590.b.C3975b)) {
                            k590Var = new k590(x590Var);
                        } else {
                            if (!(bVar instanceof x590.b.a)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            k590Var = null;
                        }
                        dVar = x590Var.d;
                        if (!(dVar instanceof x590.d.b)) {
                            Context context = clipUserView.getContext();
                            e3m.a aVar2 = e3m.a;
                            baf0Var = new baf0(m33.a(R.drawable.vk_icon_verified_16, context), clipUserView.getContext().getColor(R.color.vk_white));
                        } else {
                            if (!(dVar instanceof x590.d.a)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            baf0Var = null;
                        }
                        clipUserView.setMiddle(new ClipUserView.c(bVar2, d, k590Var, baf0Var != null ? new eko(baf0Var) : null));
                    }
                } else if (publicationDateState != null) {
                    throw new NoWhenBranchMatchedException();
                }
            }
            d = null;
            bVar = x590Var.c;
            if (!(bVar instanceof x590.b.C3975b)) {
            }
            dVar = x590Var.d;
            if (!(dVar instanceof x590.d.b)) {
            }
            clipUserView.setMiddle(new ClipUserView.c(bVar2, d, k590Var, baf0Var != null ? new eko(baf0Var) : null));
        }
        this.c = x590Var;
    }
}
