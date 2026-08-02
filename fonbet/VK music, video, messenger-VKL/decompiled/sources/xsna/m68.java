package xsna;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.location.Address;
import android.location.Geocoder;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.core.view.OverlayTextView;
import com.vk.core.view.components.badge.VkContentBadge;
import com.vk.dto.common.AttachmentWithMedia;
import com.vk.dto.common.id.UserId;
import com.vk.dto.photo.Photo;
import com.vk.dto.tags.Tag;
import com.vk.newsfeed.api.NewsfeedRouter;
import com.vk.photoviewer.PhotoViewer;
import com.vk.stat.scheme.CommonMarketStat$TypeMarketContextContent;
import com.vk.stat.scheme.CommonMarketStat$TypeRefSource;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.MobileOfficialAppsFeedStat$TypeFeedClickToShopsMoreButton;
import com.vk.stat.scheme.MobileOfficialAppsFeedStat$TypeFeedShowProductsModalCardClick;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stat.scheme.SchemeStat$TypeClick;
import com.vkontakte.android.R;
import com.vkontakte.android.attachments.DocumentAttachment;
import com.vkontakte.android.attachments.PhotoAttachment;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.reactivex.rxjava3.internal.functions.a;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import kotlin.LazyThreadSafetyMode;
import kotlin.Pair;
import kotlin.Result;
import xsna.n0o0;
import xsna.pdv0;
import xsna.qfa0;
import xsna.uij0;
import xsna.z8u0;

/* compiled from: BottomPanelController.kt */
/* loaded from: classes6.dex */
public final class m68 {
    public boolean A;
    public final FrameLayout B;
    public final ImageView C;
    public final TextView D;
    public final View E;
    public final h68 F;
    public AttachmentWithMedia G;
    public boolean H;
    public final Object I;
    public final kfj0 J;
    public final hpj K;
    public yok0 L;
    public final boolean a;
    public final String b;
    public final sz00 c;
    public final qfa0 d;
    public final NewsfeedRouter e;
    public final boolean f;
    public final String g;
    public final UserId h;

    @SuppressLint({"InflateParams"})
    public final View i;
    public z8u0.c j;
    public c9u0 k;
    public avj0 l;
    public final Context m;
    public final io.reactivex.rxjava3.disposables.b n;
    public final View o;
    public final ImageView p;
    public final TextView q;
    public final OverlayTextView r;
    public final OverlayTextView s;
    public final OverlayTextView t;
    public final OverlayTextView u;
    public final TextView v;
    public final ConstraintLayout w;
    public final VkContentBadge x;
    public final VkContentBadge y;
    public boolean z;

    /* compiled from: BottomPanelController.kt */
    public static final class a {
        public static final String a(int i) {
            return i != 0 ? uqm0.f(i) : "";
        }
    }

    /* compiled from: BottomPanelController.kt */
    public class b implements View.OnClickListener {
        public final Photo b;
        public final String c;

        public b(Photo photo, String str) {
            this.b = photo;
            this.c = str;
        }

        /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            qfa0.h e;
            int id = view.getId();
            m68 m68Var = m68.this;
            boolean z = m68Var.f;
            ?? r4 = m68Var.I;
            View view2 = m68Var.o;
            int id2 = view2.getId();
            Photo photo = this.b;
            if (id == id2) {
                if (photo.d == Integer.MIN_VALUE) {
                    return;
                }
                Set<View> set = g6z.a;
                g6z.c(view2, m68Var.p, !photo.n, true, 48);
                m68Var.g(view.getContext(), photo, !photo.n);
                return;
            }
            if (id == m68Var.r.getId()) {
                if (photo.d == Integer.MIN_VALUE) {
                    return;
                }
                qfa0 qfa0Var = m68Var.d;
                if (qfa0Var != null && (e = qfa0Var.c(photo.e).e()) != null) {
                    e.l(photo.c, this.c);
                }
                Context context = view.getContext();
                pdv0.a b = vtk0.c().b(photo);
                b.E();
                b.k(context);
                return;
            }
            if (id == m68Var.t.getId()) {
                kbj0.e(nr4.b(), view.getContext(), new PhotoAttachment(photo), false, this.c, false, com.vk.dto.common.a.a(m68Var.h), 20);
                return;
            }
            if (id == m68Var.D.getId()) {
                Activity h = e3m.h(view.getContext());
                if (h != null) {
                    try {
                        StringBuilder sb = new StringBuilder();
                        sb.append(photo.z);
                        sb.append(',');
                        sb.append(photo.A);
                        String sb2 = sb.toString();
                        h.startActivity(new Intent(CommonConstant.ACTION.HWID_SCHEME_URL, Uri.parse("geo:" + sb2 + "?z=18&q=" + sb2)));
                        s3q0 s3q0Var = s3q0.a;
                        return;
                    } catch (Throwable unused) {
                        tn00.a(h);
                        return;
                    }
                }
                return;
            }
            if (id == m68Var.u.getId()) {
                Context context2 = view.getContext();
                if (photo.k > 0 && photo.b.size() != photo.k) {
                    UserId userId = photo.e;
                    int i = photo.c;
                    String str = photo.v;
                    gfa0 gfa0Var = new gfa0("photos.getTags");
                    gfa0Var.F(userId, "owner_id");
                    gfa0Var.C(i, "photo_id");
                    if (str != null) {
                        gfa0Var.K("access_key", str);
                    }
                    io.reactivex.rxjava3.core.q m = hg1.m(rsg0.y0(gfa0Var, null, null, 3), context2, 0L, false, 62);
                    int i2 = 6;
                    p41 p41Var = new p41(new qm1(photo, 9), i2);
                    a.l lVar = io.reactivex.rxjava3.internal.functions.a.d;
                    a.k kVar = io.reactivex.rxjava3.internal.functions.a.c;
                    m68Var.n.b(m.E(p41Var, lVar, kVar, kVar).subscribe(new wn(new mh4(3, m68Var, photo), 7), new js1(new ve0(i2), i2)));
                    return;
                }
                if (photo.k <= 0) {
                    cvk.u(R.string.photo_no_tags, false);
                    return;
                }
                if (m68Var.f(photo)) {
                    c9u0 c9u0Var = m68Var.k;
                    if (c9u0Var != null) {
                        c9u0Var.a(photo.b);
                    }
                    c9u0 c9u0Var2 = m68Var.k;
                    if (c9u0Var2 != null) {
                        z8u0 z8u0Var = c9u0Var2.b;
                        z8u0Var.E = true;
                        PhotoViewer photoViewer = z8u0Var.G;
                        if (photoViewer != null) {
                            photoViewer.h();
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            VkContentBadge vkContentBadge = m68Var.x;
            if (vkContentBadge != null && id == vkContentBadge.getId()) {
                Context context3 = view.getContext();
                Pair e2 = m68.e(photo);
                int intValue = ((Number) e2.d()).intValue();
                int intValue2 = ((Number) e2.g()).intValue();
                zzq zzqVar = (zzq) r4.getValue();
                long j = photo.e.b;
                String str2 = m68Var.b;
                zzqVar.getClass();
                SchemeStat$TypeClick b2 = SchemeStat$TypeClick.a.b(new SchemeStat$EventItem(SchemeStat$EventItem.Type.MARKET_ITEM, null, Long.valueOf(j), null, str2, null, 42, null), new MobileOfficialAppsFeedStat$TypeFeedShowProductsModalCardClick(MobileOfficialAppsFeedStat$TypeFeedShowProductsModalCardClick.EntryPoint.PHOTO_VIEWER), 2);
                UiTracker uiTracker = UiTracker.a;
                MobileOfficialAppsCoreNavStat$EventScreen c = UiTracker.c();
                uzp0 uzp0Var = UiTracker.h;
                uzp0Var.getClass();
                new bjc(c, b2, uzp0Var.a).q();
                m68Var.c.c(new e1o0(photo.e, photo.c, photo.v, m68Var.b, Boolean.valueOf(intValue > 0), Boolean.valueOf(intValue2 > 0), Integer.valueOf(m68Var.f(photo) ? ((PhotoAttachment) m68Var.G).k : photo.C), CommonMarketStat$TypeMarketContextContent.Type.POST, Long.valueOf(photo.e.b), z ? CommonMarketStat$TypeRefSource.POSTS_CONTEXT_MECHANISM : null), context3);
                return;
            }
            if (id == m68Var.B.getId()) {
                avj0 avj0Var = m68Var.l;
                if (avj0Var != null) {
                    avj0Var.invoke();
                    return;
                }
                return;
            }
            VkContentBadge vkContentBadge2 = m68Var.y;
            if (vkContentBadge2 == null || id != vkContentBadge2.getId()) {
                return;
            }
            Context context4 = view.getContext();
            if (z) {
                return;
            }
            String str3 = "feed_shops_posts/shops_posts/" + m68Var.g;
            Pair a = m68.a(m68Var);
            if (a != null) {
                long longValue = ((Number) a.d()).longValue();
                long longValue2 = ((Number) a.g()).longValue();
                ((zzq) r4.getValue()).getClass();
                SchemeStat$TypeClick b3 = SchemeStat$TypeClick.a.b(new SchemeStat$EventItem(SchemeStat$EventItem.Type.POST, Long.valueOf((int) longValue2), Long.valueOf(longValue), null, this.c, null, 40, null), new MobileOfficialAppsFeedStat$TypeFeedClickToShopsMoreButton(MobileOfficialAppsFeedStat$TypeFeedClickToShopsMoreButton.EntryPoint.TIMER, null), 2);
                UiTracker uiTracker2 = UiTracker.a;
                MobileOfficialAppsCoreNavStat$EventScreen c2 = UiTracker.c();
                uzp0 uzp0Var2 = UiTracker.h;
                uzp0Var2.getClass();
                new bjc(c2, b3, uzp0Var2.a).q();
            }
            m68Var.e.L(context4, str3);
        }
    }

    public m68(l7s l7sVar, boolean z, String str, sz00 sz00Var, qfa0 qfa0Var, NewsfeedRouter newsfeedRouter, boolean z2, String str2, UserId userId) {
        this.a = z;
        this.b = str;
        this.c = sz00Var;
        this.d = qfa0Var;
        this.e = newsfeedRouter;
        this.f = z2;
        this.g = str2;
        this.h = userId;
        View inflate = LayoutInflater.from(l7sVar).inflate(R.layout.photo_viewer_bottom, (ViewGroup) null);
        this.i = inflate;
        this.m = l7sVar.getApplicationContext();
        this.n = new io.reactivex.rxjava3.disposables.b();
        h68 h68Var = new h68(this, 0);
        this.F = h68Var;
        this.H = true;
        this.I = msy.a(LazyThreadSafetyMode.NONE, new te0(4));
        bdn bdnVar = bdn.a;
        this.K = zvj.a(ie00.a);
        inflate.findViewById(R.id.photo_viewer_container).getBackground().setAlpha(l8g.b(0.62f));
        this.o = inflate.findViewById(R.id.likes);
        this.p = (ImageView) inflate.findViewById(R.id.iv_likes);
        this.q = (TextView) inflate.findViewById(R.id.tv_likes);
        this.r = (OverlayTextView) inflate.findViewById(R.id.photo_viewer_comments);
        this.s = (OverlayTextView) inflate.findViewById(R.id.photo_viewer_save_docs);
        this.u = (OverlayTextView) inflate.findViewById(R.id.photo_viewer_tags);
        this.t = (OverlayTextView) inflate.findViewById(R.id.photo_viewer_reposts);
        this.v = (TextView) inflate.findViewById(R.id.photo_viewer_descr);
        ConstraintLayout constraintLayout = (ConstraintLayout) inflate.findViewById(R.id.products_management_layout);
        this.w = constraintLayout;
        this.B = (FrameLayout) inflate.findViewById(R.id.show_product_pin_button_layout);
        this.C = (ImageView) inflate.findViewById(R.id.show_product_pin_image_view);
        this.D = (TextView) inflate.findViewById(R.id.photo_viewer_location);
        this.E = inflate.findViewById(R.id.bottom_divider);
        this.x = (VkContentBadge) inflate.findViewById(R.id.show_attached_products_button);
        VkContentBadge vkContentBadge = (VkContentBadge) inflate.findViewById(R.id.show_more_shops_button);
        this.y = vkContentBadge;
        this.J = new kfj0(constraintLayout, vkContentBadge);
        ce60.b.getClass();
        p870.f().b(113, h68Var);
    }

    public static final Pair a(m68 m68Var) {
        Object failure;
        String str = m68Var.g;
        if (str == null) {
            return null;
        }
        List b0 = drm0.b0(str, new char[]{'_'}, 0, 6);
        if (b0.size() != 2) {
            b0 = null;
        }
        if (b0 == null) {
            return null;
        }
        try {
            failure = new Pair(Long.valueOf(Long.parseLong((String) b0.get(0))), Long.valueOf(Long.parseLong((String) b0.get(1))));
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        return (Pair) (failure instanceof Result.Failure ? null : failure);
    }

    public static void d(m68 m68Var, Photo photo, b bVar) {
        boolean z = m68Var.a;
        TextView textView = m68Var.v;
        View view = m68Var.o;
        bwt0.h0(bVar, view);
        OverlayTextView overlayTextView = m68Var.s;
        bwt0.h0(bVar, overlayTextView);
        OverlayTextView overlayTextView2 = m68Var.r;
        bwt0.h0(bVar, overlayTextView2);
        OverlayTextView overlayTextView3 = m68Var.t;
        bwt0.h0(bVar, overlayTextView3);
        OverlayTextView overlayTextView4 = m68Var.u;
        bwt0.h0(bVar, overlayTextView4);
        TextView textView2 = m68Var.D;
        bwt0.h0(bVar, textView2);
        bwt0.h0(bVar, m68Var.B);
        VkContentBadge vkContentBadge = m68Var.x;
        if (vkContentBadge != null) {
            bwt0.h0(bVar, vkContentBadge);
        }
        VkContentBadge vkContentBadge2 = m68Var.y;
        if (vkContentBadge2 != null) {
            bwt0.h0(bVar, vkContentBadge2);
        }
        int i = 0;
        bwt0.p0(view, z && m68Var.H);
        bwt0.p0(overlayTextView2, z && m68Var.H);
        bwt0.p0(overlayTextView, false);
        bwt0.p0(overlayTextView4, photo.k > 0);
        String str = photo.u;
        if (str == null || str.length() == 0) {
            f4m.j(textView);
        } else {
            sdz a2 = xwk.d().a();
            ucp ucpVar = ucp.a;
            CharSequence i2 = ucp.i(a2.m(photo.u));
            textView.setVisibility(0);
            textView.setText(a2.l(i2, uij0.a.a, new i68(i, m68Var, i2)));
        }
        view.setSelected(photo.n);
        TextView textView3 = m68Var.q;
        int i3 = photo.h;
        if (i3 < 0) {
            i3 = 0;
        }
        textView3.setText(a.a(i3));
        overlayTextView2.setText(a.a(photo.j));
        overlayTextView3.setText(a.a(photo.i));
        overlayTextView4.setText(a.a(photo.k));
        View view2 = m68Var.E;
        if (bwt0.K(textView2) || bwt0.K(textView)) {
            view2.setVisibility(0);
        } else {
            f4m.j(view2);
        }
    }

    public static Pair e(Photo photo) {
        int i;
        rnd0 rnd0Var;
        List<Tag> list = photo.x;
        int i2 = 0;
        if (list != null) {
            Iterator<T> it = list.iterator();
            i = 0;
            while (it.hasNext()) {
                n0o0.a aVar = ((Tag) it.next()).f.e;
                if (aVar == null || (rnd0Var = aVar.b) == null || !rnd0Var.c) {
                    i2++;
                } else {
                    i++;
                }
            }
        } else {
            i = 0;
        }
        return new Pair(Integer.valueOf(i2), Integer.valueOf(i));
    }

    public final void b(AttachmentWithMedia attachmentWithMedia, boolean z) {
        this.G = attachmentWithMedia;
        this.H = z;
        boolean z2 = attachmentWithMedia instanceof PhotoAttachment;
        OverlayTextView overlayTextView = this.r;
        View view = this.i;
        if (z2) {
            PhotoAttachment photoAttachment = (PhotoAttachment) attachmentWithMedia;
            int i = photoAttachment.f;
            Photo photo = photoAttachment.l;
            if (i != 0 && fkq0.c(photoAttachment.g)) {
                view.setVisibility(0);
                c(photo, new b(photo, this.b));
                if (photo.o) {
                    return;
                }
                overlayTextView.setAlpha(0.6f);
                return;
            }
        }
        if (!(attachmentWithMedia instanceof DocumentAttachment)) {
            f4m.j(view);
            return;
        }
        view.setVisibility(0);
        DocumentAttachment documentAttachment = (DocumentAttachment) attachmentWithMedia;
        UserId c = o25.a().c();
        bwt0.p0(this.w, false);
        bwt0.p0(this.o, false);
        TextView textView = this.D;
        bwt0.p0(textView, false);
        bwt0.p0(overlayTextView, false);
        bwt0.p0(this.u, false);
        bwt0.p0(textView, false);
        bwt0.i0(this.t, new r6(documentAttachment, 10));
        boolean z3 = !epx.f(documentAttachment.o, c);
        OverlayTextView overlayTextView2 = this.s;
        bwt0.p0(overlayTextView2, z3);
        bwt0.i0(overlayTextView2, new h57(1, this, documentAttachment));
    }

    public final void c(final Photo photo, b bVar) {
        List<Tag> list;
        io.reactivex.rxjava3.core.q G;
        if (f(photo)) {
            d(this, photo, bVar);
            double d = photo.z;
            c9u0 c9u0Var = this.k;
            if (c9u0Var != null) {
                c9u0Var.a(photo.b);
            }
            Pair e = e(photo);
            int intValue = ((Number) e.d()).intValue();
            int intValue2 = ((Number) e.g()).intValue();
            boolean z = (this.A ? this.z : photo.r || ((list = photo.x) != null && !list.isEmpty())) && (intValue > 0 || intValue2 > 0);
            boolean z2 = intValue > 0 || intValue2 > 0;
            boolean z3 = this.z && !this.f;
            bwt0.p0(this.w, z || z3);
            VkContentBadge vkContentBadge = this.y;
            if (vkContentBadge != null) {
                vkContentBadge.setVisibility(z3 ? 0 : 8);
            }
            if (z3) {
                if (vkContentBadge != null) {
                    vkContentBadge.setAppearance(new VkContentBadge.Appearance.a(new z7g(R.color.vk_black), new z7g(R.color.vk_white), null, 12));
                }
                if (vkContentBadge != null) {
                    vkContentBadge.setText(R.string.photo_show_more_shops);
                }
            }
            this.B.setVisibility(0);
            bwt0.p0(this.C, z2);
            int i = (intValue <= 0 || intValue2 <= 0) ? intValue2 > 0 ? R.string.photo_show_attached_services_on_photo : R.string.photo_show_attached_products_on_photo : R.string.photo_show_attached_products_and_services_on_photo;
            VkContentBadge vkContentBadge2 = this.x;
            if (vkContentBadge2 != null) {
                vkContentBadge2.setAppearance(new VkContentBadge.Appearance.a(new z7g(R.color.vk_white), new z7g(R.color.vk_gray_800), null, 12));
                bwt0.p0(vkContentBadge2, z2);
                vkContentBadge2.setText(i);
            }
            double d2 = photo.A;
            TextView textView = this.D;
            if (d == -9000.0d || d2 == -9000.0d) {
                f4m.j(textView);
            } else {
                textView.setVisibility(0);
                String str = photo.w;
                if (str != null) {
                    textView.setText(str);
                } else {
                    textView.setText("");
                    if (photo.E) {
                        G = io.reactivex.rxjava3.internal.operators.observable.g0.b;
                    } else {
                        final String str2 = d + ", " + d2;
                        final Context context = this.m;
                        io.reactivex.rxjava3.internal.operators.observable.s0 s0Var = new io.reactivex.rxjava3.internal.operators.observable.s0(new Callable() { // from class: xsna.dt0
                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                Address address;
                                String str3;
                                String str4;
                                Context context2 = context;
                                Photo photo2 = photo;
                                try {
                                    List<Address> fromLocation = new Geocoder(context2.getApplicationContext()).getFromLocation(photo2.z, photo2.A, 1);
                                    if (fromLocation != null && !fromLocation.isEmpty() && (address = fromLocation.get(0)) != null) {
                                        int maxAddressLineIndex = address.getMaxAddressLineIndex() + 1;
                                        if (maxAddressLineIndex <= 0) {
                                            return "";
                                        }
                                        String addressLine = address.getAddressLine(0);
                                        if (addressLine != null) {
                                            int length = addressLine.length() - 1;
                                            int i2 = 0;
                                            boolean z4 = false;
                                            while (i2 <= length) {
                                                boolean z5 = epx.g(addressLine.charAt(!z4 ? i2 : length), 32) <= 0;
                                                if (z4) {
                                                    if (!z5) {
                                                        break;
                                                    }
                                                    length--;
                                                } else if (z5) {
                                                    i2++;
                                                } else {
                                                    z4 = true;
                                                }
                                            }
                                            str3 = addressLine.subSequence(i2, length + 1).toString();
                                        } else {
                                            str3 = "";
                                        }
                                        String postalCode = address.getPostalCode();
                                        if (maxAddressLineIndex <= 1 || (str4 = address.getAddressLine(1)) == null || str4.length() == 0) {
                                            str4 = "";
                                        } else if (postalCode != null) {
                                            String y = brm0.y(brm0.y(str4, postalCode, ""), ",,", StringUtils.COMMA);
                                            int length2 = y.length() - 1;
                                            int i3 = 0;
                                            boolean z6 = false;
                                            while (i3 <= length2) {
                                                boolean z7 = epx.g(y.charAt(!z6 ? i3 : length2), 32) <= 0;
                                                if (z6) {
                                                    if (!z7) {
                                                        break;
                                                    }
                                                    length2--;
                                                } else if (z7) {
                                                    i3++;
                                                } else {
                                                    z6 = true;
                                                }
                                            }
                                            str4 = y.subSequence(i3, length2 + 1).toString();
                                        }
                                        if (str3.length() != 0 && postalCode != null) {
                                            String y2 = brm0.y(brm0.y(str3, postalCode, ""), ",,", StringUtils.COMMA);
                                            int length3 = y2.length() - 1;
                                            int i4 = 0;
                                            boolean z8 = false;
                                            while (i4 <= length3) {
                                                boolean z9 = epx.g(y2.charAt(!z8 ? i4 : length3), 32) <= 0;
                                                if (z8) {
                                                    if (!z9) {
                                                        break;
                                                    }
                                                    length3--;
                                                } else if (z9) {
                                                    i4++;
                                                } else {
                                                    z8 = true;
                                                }
                                            }
                                            str3 = y2.subSequence(i4, length3 + 1).toString();
                                        }
                                        StringBuilder e2 = fw3.e(str3);
                                        if (!drm0.N(str4)) {
                                            e2.append(", ");
                                            e2.append(str4);
                                        }
                                        String countryName = address.getCountryName();
                                        if (countryName != null && !drm0.N(countryName) && e2.indexOf(countryName) > 0) {
                                            int lastIndexOf = e2.lastIndexOf(countryName);
                                            e2.replace(lastIndexOf, k73.a(lastIndexOf, 1, countryName), "");
                                        }
                                        return z23.c(",+(\\s*)$", e2.toString(), "");
                                    }
                                } catch (Exception unused) {
                                }
                                return str2;
                            }
                        });
                        da daVar = new da(new r6(photo, 2), 2);
                        a.l lVar = io.reactivex.rxjava3.internal.functions.a.d;
                        a.k kVar = io.reactivex.rxjava3.internal.functions.a.c;
                        io.reactivex.rxjava3.internal.operators.observable.p1 p1Var = new io.reactivex.rxjava3.internal.operators.observable.p1(s0Var.E(daVar, lVar, kVar, kVar).F(new ea(new y40(1), 2)), new ft0(new et0(str2, 0), 0));
                        asu0.a.getClass();
                        G = new io.reactivex.rxjava3.internal.operators.observable.c0(p1Var.r0(asu0.r()).a0(io.reactivex.rxjava3.android.schedulers.a.b()), new f50(new com.vk.movika.sdk.base.logic.interactor.e(photo, 4), 2), kVar).G(new gt0(photo, 0));
                    }
                    this.n.b(G.subscribe(new i22(new fo6(3, this, photo), 2)));
                }
            }
            bwt0.p0(this.t, !photo.Ib() && this.H);
            boolean K = bwt0.K(textView);
            View view = this.E;
            if (K || bwt0.K(this.v)) {
                view.setVisibility(0);
            } else {
                f4m.j(view);
            }
        }
    }

    public final boolean f(Photo photo) {
        AttachmentWithMedia attachmentWithMedia = this.G;
        if (attachmentWithMedia instanceof PhotoAttachment) {
            if (attachmentWithMedia != null ? Integer.valueOf(((PhotoAttachment) attachmentWithMedia).f).equals(Integer.valueOf(photo.c)) : false) {
                AttachmentWithMedia attachmentWithMedia2 = this.G;
                if (epx.f(attachmentWithMedia2 != null ? attachmentWithMedia2.q() : null, photo.e)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void g(Context context, Photo photo, boolean z) {
        if (o25.a().b()) {
            if (!photo.l) {
                z8u0.c cVar = this.j;
                if (cVar != null) {
                    z8u0.this.U(photo, new j68(this, context, z));
                    return;
                }
                return;
            }
            int i = photo.h;
            photo.n = z;
            if (z) {
                photo.h = i + 1;
            } else {
                photo.h = i - 1;
            }
            s9x0 s9x0Var = new s9x0(z, null, photo.e, photo.c, 1, 0, photo.v, UserId.d, null);
            s9x0Var.j("ref", com.vk.stat.scheme.t0.a(MobileOfficialAppsCoreNavStat$EventScreen.PHOTO_BROWSER));
            io.reactivex.rxjava3.internal.operators.observable.m1 y0 = rsg0.y0(s9x0Var, null, null, 3);
            mp0 mp0Var = new mp0(new k68(photo, z, this, context), 6);
            a.l lVar = io.reactivex.rxjava3.internal.functions.a.d;
            a.k kVar = io.reactivex.rxjava3.internal.functions.a.c;
            io.reactivex.rxjava3.internal.operators.observable.b0 G = y0.E(mp0Var, lVar, kVar, kVar).F(new bw(new l68(photo, z, i), 11)).G(new f68(0, this, photo));
            int i2 = kwg0.a;
            this.n.b(G.subscribe(new iwg0(), new g68(0)));
        }
    }
}
