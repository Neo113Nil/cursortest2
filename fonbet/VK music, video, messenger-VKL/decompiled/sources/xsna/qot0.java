package xsna;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import com.vk.catalog2.common.ui.mvp.holder.video.VideoCatalogRootVh;
import com.vk.clips.upload.model.ClipUploadData;
import com.vk.core.apps.BuildInfo;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.core.view.components.button.VkButton;
import com.vk.dto.common.id.UserId;
import com.vk.libvideo.api.VkVideoChannelVideoSubTab;
import com.vk.libvideo.upload.api.VideoUploadEvent;
import com.vk.log.L;
import com.vk.navigation.NavigationDelegateActivity;
import com.vk.stat.scheme.MobileOfficialAppsVideoStat$TypeVideoUploadClick;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stat.scheme.SchemeStat$TypeClick;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Lazy;
import kotlin.Pair;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.ok.android.utils.Logger;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.b9s0;
import xsna.utj;

/* compiled from: VideoUploadSnackBarManager.kt */
/* loaded from: classes.dex */
public final class qot0 {
    public final NavigationDelegateActivity a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;
    public final Object h;
    public final bpn0 i = new bpn0(new nb8(21));
    public final bpn0 j;
    public final bpn0 k;
    public final rot0 l;
    public final io.reactivex.rxjava3.disposables.b m;
    public final a n;
    public View o;
    public boolean p;
    public utj q;
    public UserId r;
    public Integer s;
    public boolean t;

    /* compiled from: VideoUploadSnackBarManager.kt */
    public final class a {
        public a() {
        }
    }

    /* compiled from: VideoUploadSnackBarManager.kt */
    /* loaded from: classes3.dex */
    public static final /* synthetic */ class b extends FunctionReferenceImpl implements izs<Throwable, s3q0> {
        public b(Object obj) {
            super(1, obj, L.class, Logger.METHOD_E, "e(Ljava/lang/Throwable;)V", 0);
        }

        @Override // xsna.izs
        public final s3q0 invoke(Throwable th) {
            L.i(th);
            return s3q0.a;
        }
    }

    public qot0(NavigationDelegateActivity navigationDelegateActivity, Lazy lazy, Lazy lazy2, Lazy lazy3, Lazy lazy4, Lazy lazy5, Lazy lazy6, Lazy lazy7) {
        this.a = navigationDelegateActivity;
        this.b = lazy;
        this.c = lazy2;
        this.d = lazy3;
        this.e = lazy4;
        this.f = lazy5;
        this.g = lazy6;
        this.h = lazy7;
        bpn0 bpn0Var = new bpn0(new p5m(11));
        this.j = bpn0Var;
        this.k = new bpn0(new b55(11));
        this.l = new rot0(navigationDelegateActivity, ((Boolean) bpn0Var.getValue()).booleanValue());
        this.m = new io.reactivex.rxjava3.disposables.b();
        this.n = new a();
        this.p = true;
        this.r = UserId.d;
        Lifecycle lifecycle = navigationDelegateActivity.getLifecycle();
        if (lifecycle != null) {
            lifecycle.addObserver(new pot0(this));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [xsna.oot0] */
    public final boolean a(final UserId userId, final long j, View view, boolean z) {
        boolean z2 = false;
        if (!this.p) {
            return false;
        }
        HashSet hashSet = iah0.a;
        NavigationDelegateActivity navigationDelegateActivity = this.a;
        boolean d = fnj.d(navigationDelegateActivity);
        boolean z3 = fxc0.B().J().E0() && d;
        this.o = view;
        if (((Boolean) this.j.getValue()).booleanValue() && !z) {
            z2 = true;
        }
        if (z2) {
            jjc.g((VkButton) view.findViewById(R.id.bottom_action_button), new izs() { // from class: xsna.not0
                /* JADX WARN: Multi-variable type inference failed */
                @Override // xsna.izs
                public final Object invoke(Object obj) {
                    UiTracker uiTracker = UiTracker.a;
                    new bjc(UiTracker.c(), SchemeStat$TypeClick.a.b(new SchemeStat$EventItem(SchemeStat$EventItem.Type.VIDEO, null, null, null, null, null, 62, null), new MobileOfficialAppsVideoStat$TypeVideoUploadClick(MobileOfficialAppsVideoStat$TypeVideoUploadClick.EventType.CLICK_TO_UPLOAD_VIDEO, null, 2, 0 == true ? 1 : 0), 2)).q();
                    boolean z4 = j > 0;
                    qot0 qot0Var = qot0.this;
                    qot0Var.d(userId, z4);
                    utj utjVar = qot0Var.q;
                    if (utjVar != null) {
                        utjVar.b();
                    }
                    return s3q0.a;
                }
            });
        }
        this.r = userId == null ? UserId.d : userId;
        utj.a aVar = new utj.a(navigationDelegateActivity);
        aVar.e(view);
        if (z3) {
            aVar.f(1);
        }
        boolean d2 = fnj.d(navigationDelegateActivity);
        aVar.h((fxc0.B().J().E0() && d2) ? utj.t : d2 ? iah0.a(92) : utj.t);
        aVar.i(d ? utj.t : utj.s);
        aVar.l();
        if (!z2) {
            aVar.c(new gzs() { // from class: xsna.oot0
                @Override // xsna.gzs
                public final Object invoke() {
                    qot0.this.d(userId, j > 0);
                    return Boolean.TRUE;
                }
            });
        }
        aVar.b(new xld(this, userId, view, 4));
        this.q = aVar.a();
        return true;
    }

    public final eed b(eed eedVar, boolean z) {
        ClipUploadData d = eedVar.a.d();
        if (!((Boolean) this.k.getValue()).booleanValue() && d.Ab().w0() == null) {
            return null;
        }
        if (z) {
            int S = d.S();
            Integer num = this.s;
            if (num == null || S != num.intValue()) {
                return null;
            }
        }
        return eedVar;
    }

    public final void c() {
        hg1.e(this.m, io.reactivex.rxjava3.core.x.t(3L, TimeUnit.SECONDS).m(asu0.a.d()).subscribe(new a960(new qzl0(this, 13), 29), new vks0(new b(L.a), 1)));
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, kotlin.Lazy] */
    public final void d(UserId userId, boolean z) {
        String str;
        if (userId == null || this.s != null) {
            return;
        }
        if (BuildInfo.q() && !fkq0.d(userId)) {
            if (z && ((Boolean) this.i.getValue()).booleanValue()) {
                VkVideoChannelVideoSubTab vkVideoChannelVideoSubTab = VkVideoChannelVideoSubTab.ALL;
            } else {
                VkVideoChannelVideoSubTab vkVideoChannelVideoSubTab2 = VkVideoChannelVideoSubTab.ALL;
            }
            fxc0.B().Y().getClass();
            return;
        }
        if (fkq0.d(userId)) {
            StringBuilder sb = new StringBuilder("https://");
            sb.append(a0a.d);
            sb.append("/video/@id");
            str = efz.b(o25.a().c().b, "/uploaded", sb);
        } else {
            str = null;
        }
        b9s0 b9s0Var = new b9s0(userId, str, new b9s0.a(new d8t0(this, 3), null, null, 510));
        r4a r4aVar = new r4a();
        new VideoCatalogRootVh(null, this.a, r4aVar, true, null, null, null, null, null, null, null, null, null, null, new iml0(this, 20), (be80) this.f.getValue(), (ih80) this.e.getValue(), null, null, null, null, null, null, false, 33325027);
        hg1.e(this.m, b9s0Var.A0().subscribe(new nex(new wyg(b9s0Var, r4aVar, this, 6), 29)));
    }

    /* JADX WARN: Type inference failed for: r3v6, types: [java.lang.Object, kotlin.Lazy] */
    public final void e(List<? extends VideoUploadEvent> list) {
        Object obj;
        boolean z;
        String str;
        Iterator<T> it = list.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (obj instanceof VideoUploadEvent.Start) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        if (!(obj instanceof VideoUploadEvent.Start)) {
            obj = null;
        }
        if (((VideoUploadEvent.Start) obj) != null) {
            this.s = null;
        }
        if (this.s != null) {
            return;
        }
        boolean z2 = this.p;
        NavigationDelegateActivity navigationDelegateActivity = this.a;
        if (!z2 && this.q == null) {
            Lifecycle lifecycle = navigationDelegateActivity.getLifecycle();
            if ((lifecycle != null ? lifecycle.getCurrentState() : null) == Lifecycle.State.RESUMED) {
                if ((list.isEmpty() ? false : list.get(0) instanceof VideoUploadEvent.Progress) && !this.p) {
                    this.o = null;
                    this.p = true;
                }
            }
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            if (((VideoUploadEvent) obj2).b.Kb()) {
                arrayList.add(obj2);
            }
        }
        if (this.p && !arrayList.isEmpty()) {
            if (!arrayList.isEmpty()) {
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    VideoUploadEvent videoUploadEvent = (VideoUploadEvent) it2.next();
                    if (!((videoUploadEvent instanceof VideoUploadEvent.Fail) && ((o2i) this.c.getValue()).a(((VideoUploadEvent.Fail) videoUploadEvent).Ab()))) {
                        z = false;
                        break;
                    }
                }
            }
            z = true;
            if (!z) {
                View view = this.o;
                rot0 rot0Var = this.l;
                if (view == null || !view.equals(rot0Var.a())) {
                    utj utjVar = this.q;
                    if (utjVar != null) {
                        utjVar.b();
                    }
                    if (!a(((VideoUploadEvent) arrayList.get(0)).b.q(), ((VideoUploadEvent) arrayList.get(0)).b.Db(), rot0Var.a(), false)) {
                        return;
                    }
                    utj utjVar2 = this.q;
                    if (utjVar2 != null) {
                        utjVar2.e();
                    }
                } else if (!epx.f(this.r, ((VideoUploadEvent) arrayList.get(0)).b.q())) {
                    utj utjVar3 = this.q;
                    if (utjVar3 != null) {
                        utjVar3.b();
                    }
                    if (!this.p) {
                        this.o = null;
                        this.p = true;
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                Iterator it3 = arrayList.iterator();
                while (it3.hasNext()) {
                    Object next = it3.next();
                    if (epx.f(((VideoUploadEvent) next).b.q(), this.r)) {
                        arrayList2.add(next);
                    }
                }
                String str2 = "%)";
                long j = 0;
                if (!((Boolean) this.j.getValue()).booleanValue()) {
                    VideoUploadEvent.Progress progress = null;
                    TextView textView = (TextView) rot0Var.a().findViewById(R.id.status);
                    ArrayList arrayList3 = new ArrayList();
                    Iterator it4 = arrayList2.iterator();
                    while (it4.hasNext()) {
                        Object next2 = it4.next();
                        if (((VideoUploadEvent) next2).b.Jb()) {
                            arrayList3.add(next2);
                        }
                    }
                    ArrayList arrayList4 = new ArrayList();
                    Iterator it5 = arrayList2.iterator();
                    while (it5.hasNext()) {
                        Object next3 = it5.next();
                        if (((VideoUploadEvent) next3).b.Hb()) {
                            arrayList4.add(next3);
                        }
                    }
                    ArrayList arrayList5 = new ArrayList();
                    Iterator it6 = arrayList2.iterator();
                    while (it6.hasNext()) {
                        Object next4 = it6.next();
                        VideoUploadEvent videoUploadEvent2 = (VideoUploadEvent) next4;
                        if ((videoUploadEvent2 instanceof VideoUploadEvent.Progress) || (videoUploadEvent2 instanceof VideoUploadEvent.Start)) {
                            arrayList5.add(next4);
                        }
                    }
                    if (arrayList4.size() + arrayList3.size() == arrayList2.size()) {
                        textView.setText(arrayList3.isEmpty() ? navigationDelegateActivity.getString(R.string.video_upload_progress_snack_canceled) : navigationDelegateActivity.getString(R.string.video_upload_error));
                        return;
                    }
                    StringBuilder sb = new StringBuilder();
                    if (arrayList5.isEmpty()) {
                        c();
                        sb.append(navigationDelegateActivity.getString(R.string.video_upload_progress_snack_complete));
                        if (!arrayList3.isEmpty()) {
                            sb.append(navigationDelegateActivity.getResources().getQuantityString(R.plurals.video_upload_error, arrayList3.size(), Integer.valueOf(arrayList3.size())));
                        }
                    } else {
                        Iterator it7 = arrayList5.iterator();
                        double d = ConnectivityTracker.DEFAULT_UPLINK_BITRATE;
                        while (it7.hasNext()) {
                            VideoUploadEvent videoUploadEvent3 = (VideoUploadEvent) it7.next();
                            VideoUploadEvent.Progress progress2 = videoUploadEvent3 instanceof VideoUploadEvent.Progress ? (VideoUploadEvent.Progress) videoUploadEvent3 : null;
                            d = (progress2 != null ? Float.valueOf(progress2.Ab()) : 0).doubleValue() + d;
                        }
                        int size = (int) (100 * (d / arrayList5.size()));
                        lar larVar = lar.a;
                        Iterator it8 = arrayList5.iterator();
                        while (it8.hasNext()) {
                            VideoUploadEvent videoUploadEvent4 = (VideoUploadEvent) it8.next();
                            VideoUploadEvent.Progress progress3 = videoUploadEvent4 instanceof VideoUploadEvent.Progress ? (VideoUploadEvent.Progress) videoUploadEvent4 : progress;
                            j += (long) ((progress3 != null ? Float.valueOf(progress3.Ab()) : 0).doubleValue() * videoUploadEvent4.b.Bb());
                            str2 = str2;
                            progress = null;
                        }
                        String str3 = str2;
                        larVar.getClass();
                        String a2 = lar.a(j);
                        if (arrayList3.isEmpty()) {
                            sb.append(navigationDelegateActivity.getResources().getQuantityString(R.plurals.video_upload_progress_snack, arrayList5.size(), Integer.valueOf(arrayList5.size()), a2));
                        } else {
                            sb.append(navigationDelegateActivity.getResources().getQuantityString(R.plurals.video_upload_progress_snack_with_error, arrayList5.size(), Integer.valueOf(arrayList5.size()), navigationDelegateActivity.getResources().getQuantityString(R.plurals.video_upload_error, arrayList3.size(), Integer.valueOf(arrayList3.size())), a2));
                        }
                        sb.append(" (" + size + str3);
                    }
                    textView.setText(sb.toString());
                    return;
                }
                long Db = ((VideoUploadEvent) arrayList.get(0)).b.Db();
                String P = ((VideoUploadEvent) arrayList.get(0)).b.P();
                boolean Cb = ((VideoUploadEvent) arrayList.get(0)).b.Cb();
                Integer valueOf = Integer.valueOf(R.attr.vk_ui_icon_negative);
                Integer valueOf2 = Integer.valueOf(R.drawable.vk_icon_error_circle_outline_28);
                ArrayList arrayList6 = new ArrayList();
                Iterator it9 = arrayList2.iterator();
                while (it9.hasNext()) {
                    Object next5 = it9.next();
                    if (((VideoUploadEvent) next5).b.Jb()) {
                        arrayList6.add(next5);
                    }
                }
                ArrayList arrayList7 = new ArrayList();
                Iterator it10 = arrayList2.iterator();
                while (it10.hasNext()) {
                    Object next6 = it10.next();
                    if (((VideoUploadEvent) next6).b.Hb()) {
                        arrayList7.add(next6);
                    }
                }
                ArrayList arrayList8 = new ArrayList();
                Iterator it11 = arrayList2.iterator();
                while (it11.hasNext()) {
                    Object next7 = it11.next();
                    ArrayList arrayList9 = arrayList2;
                    VideoUploadEvent videoUploadEvent5 = (VideoUploadEvent) next7;
                    String str4 = P;
                    if ((videoUploadEvent5 instanceof VideoUploadEvent.Progress) || (videoUploadEvent5 instanceof VideoUploadEvent.Start)) {
                        arrayList8.add(next7);
                    }
                    arrayList2 = arrayList9;
                    P = str4;
                }
                String str5 = P;
                if (arrayList7.size() + arrayList6.size() == arrayList2.size()) {
                    c();
                    f(new Pair<>(valueOf2, valueOf), arrayList6.isEmpty() ? navigationDelegateActivity.getString(R.string.video_upload_progress_snack_canceled) : navigationDelegateActivity.getString(R.string.video_upload_error), null, null);
                    return;
                }
                if (arrayList8.isEmpty() && arrayList6.isEmpty()) {
                    c();
                    f(new Pair<>(Integer.valueOf(R.drawable.vk_icon_check_circle_outline_28), Integer.valueOf(R.attr.vk_ui_icon_positive)), Db > 0 ? navigationDelegateActivity.getString(R.string.video_upload_done_snack_scheduled_subtitle, pvo0.i(false, (int) TimeUnit.MILLISECONDS.toSeconds(Db), false, true)) : Cb ? navigationDelegateActivity.getString(R.string.video_upload_done_snack_ord_subtitle) : (str5 == null || !(drm0.N(str5) ^ true)) ? navigationDelegateActivity.getString(R.string.video_upload_done_snack_no_channel_name_subtitle) : navigationDelegateActivity.getString(R.string.video_upload_done_snack_subtitle, str5), null, navigationDelegateActivity.getString(R.string.video_upload_done_snack_action_button_text));
                    return;
                }
                if (arrayList8.isEmpty() && !arrayList6.isEmpty()) {
                    c();
                    f(new Pair<>(valueOf2, valueOf), navigationDelegateActivity.getString(R.string.video_upload_progress_snack_complete), navigationDelegateActivity.getResources().getQuantityString(R.plurals.video_upload_error, arrayList6.size(), Integer.valueOf(arrayList6.size())), null);
                    return;
                }
                Iterator it12 = arrayList8.iterator();
                double d2 = ConnectivityTracker.DEFAULT_UPLINK_BITRATE;
                while (it12.hasNext()) {
                    VideoUploadEvent videoUploadEvent6 = (VideoUploadEvent) it12.next();
                    VideoUploadEvent.Progress progress4 = videoUploadEvent6 instanceof VideoUploadEvent.Progress ? (VideoUploadEvent.Progress) videoUploadEvent6 : null;
                    d2 = (progress4 != null ? Float.valueOf(progress4.Ab()) : 0).doubleValue() + d2;
                }
                int size2 = (int) (100 * (d2 / arrayList8.size()));
                lar larVar2 = lar.a;
                Iterator it13 = arrayList8.iterator();
                while (it13.hasNext()) {
                    VideoUploadEvent videoUploadEvent7 = (VideoUploadEvent) it13.next();
                    VideoUploadEvent.Progress progress5 = videoUploadEvent7 instanceof VideoUploadEvent.Progress ? (VideoUploadEvent.Progress) videoUploadEvent7 : null;
                    j += (long) ((progress5 != null ? Float.valueOf(progress5.Ab()) : 0).doubleValue() * videoUploadEvent7.b.Bb());
                }
                larVar2.getClass();
                String a3 = lar.a(j);
                Pair<Integer, Integer> pair = new Pair<>(Integer.valueOf(R.drawable.vk_icon_upload_outline_28), Integer.valueOf(R.attr.vk_ui_icon_accent_themed));
                String string = navigationDelegateActivity.getString(R.string.video_upload_description);
                if (arrayList6.isEmpty() && arrayList8.size() == 1) {
                    str = a3 + " (" + size2 + "%)";
                } else if (!arrayList6.isEmpty() || arrayList8.size() <= 1) {
                    str = navigationDelegateActivity.getResources().getQuantityString(R.plurals.video_upload_progress_snack_with_error, arrayList8.size(), Integer.valueOf(arrayList8.size()), navigationDelegateActivity.getResources().getQuantityString(R.plurals.video_upload_error, arrayList6.size(), Integer.valueOf(arrayList6.size())), a3) + " (" + size2 + "%)";
                } else {
                    str = navigationDelegateActivity.getResources().getQuantityString(R.plurals.video_upload_progress_snack, arrayList8.size(), Integer.valueOf(arrayList8.size()), a3);
                }
                f(pair, string, str, navigationDelegateActivity.getString(R.string.video_upload_progress_snack_action_button_text));
                return;
            }
        }
        utj utjVar4 = this.q;
        if (utjVar4 != null) {
            utjVar4.b();
        }
    }

    public final void f(Pair<Integer, Integer> pair, String str, String str2, String str3) {
        rot0 rot0Var = this.l;
        ImageView imageView = (ImageView) rot0Var.a().findViewById(R.id.icon);
        TextView textView = (TextView) rot0Var.a().findViewById(R.id.title);
        TextView textView2 = (TextView) rot0Var.a().findViewById(R.id.status);
        VkButton vkButton = (VkButton) rot0Var.a().findViewById(R.id.bottom_action_button);
        imageView.setVisibility(0);
        imageView.setImageResource(pair.i().intValue());
        imageView.setColorFilter(krv0.m(pair.j().intValue(), this.a));
        if (str != null) {
            textView.setVisibility(0);
            textView.setText(str);
        } else {
            textView.setVisibility(8);
        }
        if (str2 != null) {
            textView2.setVisibility(0);
            textView2.setText(str2);
        } else {
            textView2.setVisibility(8);
        }
        if (str3 == null) {
            vkButton.setVisibility(8);
        } else {
            vkButton.setVisibility(0);
            vkButton.setText(str3);
        }
    }

    public final void g(View view) {
        if (this.p) {
            this.s = null;
            utj utjVar = this.q;
            if (utjVar != null) {
                utjVar.b();
            }
            NavigationDelegateActivity navigationDelegateActivity = this.a;
            utj.a aVar = new utj.a(navigationDelegateActivity);
            aVar.e(view);
            aVar.i(fnj.d(navigationDelegateActivity) ? utj.t : utj.s);
            aVar.h(fnj.d(navigationDelegateActivity) ? iah0.a(92) : utj.t);
            aVar.k(TimeUnit.SECONDS.toMillis(3L));
            aVar.b(new c1o0(7, view, this));
            aVar.m();
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    public final void h(String str) {
        View view = (View) this.l.f.getValue();
        ((TextView) view.findViewById(R.id.title)).setText(str);
        g(view);
    }

    public final void i(boolean z) {
        utj utjVar;
        if (!z) {
            utj utjVar2 = this.q;
            if (utjVar2 != null) {
                utjVar2.b();
            }
            this.t = true;
            return;
        }
        utj utjVar3 = this.q;
        if (utjVar3 == null || utjVar3.c() || (utjVar = this.q) == null) {
            return;
        }
        utjVar.e();
    }
}
