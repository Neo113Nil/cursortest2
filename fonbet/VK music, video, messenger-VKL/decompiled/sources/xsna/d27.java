package xsna;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import com.vk.clips.sdk.shared.api.deps.video.SdkVideoFile;
import com.vk.dto.attaches.Attach;
import com.vk.feed.core.models.MyTargetAdsComplainOptions;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.im.engine.models.messages.Msg;
import com.vk.im.settings.DarkThemeTimetableFragment;
import com.vk.libvideo.ui.VideoHidePollView;
import com.vk.mytarget.report.MyTargetReportFragment;
import com.vk.newsfeed.posting.impl.domain.model.PostingAction;
import com.vk.newsfeed.posting.mediapicker.localmedia.LocalMediaPickerFragment;
import com.vk.stat.sak.scheme.SchemeStatSak$EventScreen;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import xsna.phb;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class d27 implements View.OnClickListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ d27(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Activity m;
        Object obj;
        Object obj2;
        int i = this.b;
        Object obj3 = this.c;
        switch (i) {
            case 0:
                ((g27) obj3).U6(view);
                break;
            case 1:
                ((qhb) obj3).O(phb.a.b);
                break;
            case 2:
                int i2 = DarkThemeTimetableFragment.Q;
                h3p0.b((DarkThemeTimetableFragment) obj3);
                break;
            case 3:
                ((xlu) obj3).getPresenter().b();
                break;
            case 4:
                com.vk.im.video.g gVar = (com.vk.im.video.g) obj3;
                t4w t4wVar = gVar.t;
                if (t4wVar == null) {
                    t4wVar = null;
                }
                if (!t4wVar.W0() && (m = gVar.m()) != null) {
                    fh5 fh5Var = gVar.w;
                    (fh5Var != null ? fh5Var : null).j0(m);
                    break;
                }
                break;
            case 5:
                int i3 = LocalMediaPickerFragment.d0;
                efc0 go = ((LocalMediaPickerFragment) obj3).go();
                if (go != null) {
                    go.C(PostingAction.MediaPicker.OpenCamera.b);
                    break;
                }
                break;
            case 6:
                xt30 xt30Var = (xt30) obj3;
                pk30 pk30Var = xt30Var.E;
                yt30 yt30Var = xt30Var.D;
                Msg msg = yt30Var != null ? yt30Var.E : null;
                Attach attach = yt30Var != null ? yt30Var.G : null;
                if (pk30Var != null && msg != null && attach != null) {
                    pk30Var.O(attach);
                    break;
                }
                break;
            case 7:
                MyTargetReportFragment myTargetReportFragment = (MyTargetReportFragment) obj3;
                ?? r0 = myTargetReportFragment.W;
                int i4 = MyTargetReportFragment.X;
                String obj4 = view.getTag().toString();
                Bundle arguments = myTargetReportFragment.getArguments();
                Integer d = arguments != null ? bo8.d(arguments, "ENTRY_HASH_ENABLED") : null;
                Bundle arguments2 = myTargetReportFragment.getArguments();
                NewsEntry newsEntry = arguments2 != null ? (NewsEntry) arguments2.getParcelable("ADS_NEWS_ITEM") : null;
                if (d != null || newsEntry != null) {
                    Intent intent = new Intent("com.vkontakte.android.AD_REPORTED");
                    intent.putExtra("adchoice_option_text", obj4);
                    if (d != null) {
                        NewsEntry a = ((r5g0) r0.getValue()).a(d);
                        if (a != null) {
                            intent.putExtra("ad_entry_hash", a.hashCode());
                            ((r5g0) r0.getValue()).d(a);
                        }
                    } else {
                        intent.putExtra("ad_entry", newsEntry);
                    }
                    Context context = e43.a;
                    if (context == null) {
                        context = null;
                    }
                    n2i0.a(context, hf8.a, intent);
                    myTargetReportFragment.ko(obj4);
                }
                Bundle arguments3 = myTargetReportFragment.getArguments();
                SdkVideoFile sdkVideoFile = arguments3 != null ? (SdkVideoFile) arguments3.getParcelable("ADS_VIDEO_ITEM") : null;
                if (sdkVideoFile != null) {
                    Intent intent2 = new Intent("com.vkontakte.android.CLIPS_AD_REPORTED");
                    Parcelable[] io2 = myTargetReportFragment.io();
                    ArrayList arrayList = new ArrayList();
                    for (Parcelable parcelable : io2) {
                        MyTargetAdsComplainOptions myTargetAdsComplainOptions = parcelable instanceof MyTargetAdsComplainOptions ? (MyTargetAdsComplainOptions) parcelable : null;
                        if (myTargetAdsComplainOptions != null) {
                            arrayList.add(myTargetAdsComplainOptions);
                        }
                    }
                    Iterator it = arrayList.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            obj2 = it.next();
                            if (epx.f(((MyTargetAdsComplainOptions) obj2).c, obj4)) {
                            }
                        } else {
                            obj2 = null;
                        }
                    }
                    MyTargetAdsComplainOptions myTargetAdsComplainOptions2 = (MyTargetAdsComplainOptions) obj2;
                    String str = myTargetAdsComplainOptions2 != null ? myTargetAdsComplainOptions2.d : null;
                    if (myc0.f(str)) {
                        intent2.putExtra("adchoice_alias", str);
                    }
                    intent2.putExtra("ad_video", sdkVideoFile);
                    Context context2 = e43.a;
                    if (context2 == null) {
                        context2 = null;
                    }
                    n2i0.a(context2, hf8.a, intent2);
                    myTargetReportFragment.ko(obj4);
                }
                Bundle arguments4 = myTargetReportFragment.getArguments();
                String string = arguments4 != null ? arguments4.getString("AD_UNIQUE_KEY") : null;
                if (string != null) {
                    Intent intent3 = new Intent("com.vkontakte.android.CLIPS_MARKET_AD_REPORTED");
                    Parcelable[] io3 = myTargetReportFragment.io();
                    ArrayList arrayList2 = new ArrayList();
                    for (Parcelable parcelable2 : io3) {
                        MyTargetAdsComplainOptions myTargetAdsComplainOptions3 = parcelable2 instanceof MyTargetAdsComplainOptions ? (MyTargetAdsComplainOptions) parcelable2 : null;
                        if (myTargetAdsComplainOptions3 != null) {
                            arrayList2.add(myTargetAdsComplainOptions3);
                        }
                    }
                    Iterator it2 = arrayList2.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            obj = it2.next();
                            if (epx.f(((MyTargetAdsComplainOptions) obj).c, obj4)) {
                            }
                        } else {
                            obj = null;
                        }
                    }
                    MyTargetAdsComplainOptions myTargetAdsComplainOptions4 = (MyTargetAdsComplainOptions) obj;
                    String str2 = myTargetAdsComplainOptions4 != null ? myTargetAdsComplainOptions4.d : null;
                    if (myc0.f(str2)) {
                        intent3.putExtra("adchoice_alias", str2);
                    }
                    intent3.putExtra("ad_unique_key", string);
                    Context context3 = e43.a;
                    n2i0.a(context3 != null ? context3 : null, hf8.a, intent3);
                    myTargetReportFragment.ko(obj4);
                }
                cvk.u(R.string.report_screen_success_result, false);
                myTargetReportFragment.finish();
                break;
            case 8:
                vl90 vl90Var = (vl90) obj3;
                otu0 un = vl90Var.un();
                Context requireContext = vl90Var.requireContext();
                SchemeStatSak$EventScreen schemeStatSak$EventScreen = SchemeStatSak$EventScreen.OTHER;
                un.getClass();
                otu0.b(requireContext, schemeStatSak$EventScreen);
                break;
            case 9:
                VideoHidePollView videoHidePollView = (VideoHidePollView) obj3;
                videoHidePollView.v.invoke(new VideoHidePollView.a.C1250a(1, videoHidePollView.u.getText().toString()));
                videoHidePollView.P4();
                break;
            case 10:
                ymu0 ymu0Var = (ymu0) obj3;
                otu0 un2 = ymu0Var.un();
                Context requireContext2 = ymu0Var.requireContext();
                SchemeStatSak$EventScreen schemeStatSak$EventScreen2 = SchemeStatSak$EventScreen.NOWHERE;
                un2.getClass();
                otu0.b(requireContext2, schemeStatSak$EventScreen2);
                break;
            default:
                ((g0v0) obj3).d();
                break;
        }
    }
}
