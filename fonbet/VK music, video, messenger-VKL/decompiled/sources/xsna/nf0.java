package xsna;

import android.content.Context;
import android.os.Handler;
import android.view.MotionEvent;
import android.widget.AutoCompleteTextView;
import androidx.recyclerview.widget.RecyclerView;
import com.ironsource.C4490p6;
import com.unity3d.services.UnityAdsConstants;
import com.vk.catalog2.common.ui.mvp.holder.search.SearchInCommunityCatalogRootVh;
import com.vk.catalog2.feature.music.ui.holder.MusicOfflineCatalogRootVh;
import com.vk.clips.upload.vk.impl.uploader.ClipsPersistentStore;
import com.vk.core.tool.onboarding.VkOnboarding$HighlighterMode;
import com.vk.core.tool.view.onboarding.highlighter.VkOnboardingHighlighter;
import com.vk.debug.ui.dev.DebugDevSettingsFragment;
import com.vk.friends.discover.UsersDiscoverFragment;
import com.vk.media.pipeline.di.MediaPipelineComponent;
import com.vk.media.pipeline.model.transform.TransformFormat;
import com.vk.multiaccount.api.di.VkClientMultiAccountComponent;
import com.vk.sharing.im_engine_impl.BaseSharingExternalActivity;
import com.vk.stories.StoriesVideoEncoder;
import com.vk.superapp.vkpay.checkout.feature.pin.success.PinSuccessView;
import com.vkontakte.android.R;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import xsna.crl;
import xsna.qpa0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class nf0 implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ nf0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Type inference failed for: r7v6, types: [java.lang.Object, kotlin.Lazy] */
    @Override // java.lang.Runnable
    public final void run() {
        int i = this.b;
        boolean z = false;
        Object obj = this.c;
        switch (i) {
            case 0:
                rf0 rf0Var = (rf0) obj;
                if (!rf0Var.itemView.isAttachedToWindow() || rf0Var.getBindingAdapterPosition() == -1) {
                    return;
                }
                rf0Var.R6().setWithShine(true);
                return;
            case 1:
                p52 p52Var = (p52) obj;
                p52Var.F0 = false;
                MotionEvent motionEvent = p52Var.x0;
                if (motionEvent.getActionMasked() != 10) {
                    throw new IllegalStateException("The ACTION_HOVER_EXIT event was not cleared.");
                }
                p52Var.a0(motionEvent);
                return;
            case 2:
                com.vk.clips.upload.vk.impl.uploader.c.e.e((ClipsPersistentStore.PersistedUpload) obj, ClipsPersistentStore.PersistedUpload.State.CANCELLED);
                return;
            case 3:
                String[] strArr = DebugDevSettingsFragment.t0;
                ((AutoCompleteTextView) obj).showDropDown();
                return;
            case 4:
                ((crl) obj).h.e();
                return;
            case 5:
                ((d1n) obj).a.setSelected(true);
                return;
            case 6:
                b3r0.b((InputStream) obj);
                return;
            case 7:
                m340 m340Var = (m340) obj;
                BaseSharingExternalActivity baseSharingExternalActivity = m340Var.a.get();
                if (baseSharingExternalActivity != null) {
                    VkClientMultiAccountComponent b = m340Var.b();
                    jlu0 a = b != null ? b.a() : null;
                    if (a != null && a.a(baseSharingExternalActivity.getSupportFragmentManager())) {
                        z = true;
                    }
                    if (z) {
                        i0q0.d(50L, m340Var.f);
                    } else {
                        m340Var.c(baseSharingExternalActivity);
                    }
                    s3q0 s3q0Var = s3q0.a;
                    return;
                }
                return;
            case 8:
                MusicOfflineCatalogRootVh musicOfflineCatalogRootVh = (MusicOfflineCatalogRootVh) obj;
                mzp0 mzp0Var = musicOfflineCatalogRootVh.N;
                if (mzp0Var != null) {
                    mzp0Var.a();
                }
                g3a.a(musicOfflineCatalogRootVh.z, musicOfflineCatalogRootVh);
                return;
            case 9:
                PinSuccessView pinSuccessView = (PinSuccessView) obj;
                int i2 = PinSuccessView.c;
                pinSuccessView.animate().setStartDelay(2000L).alpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT).setDuration(300L).withEndAction(new n52(pinSuccessView, 13));
                return;
            case 10:
                int i3 = aqe0.m1;
                ((aqe0) obj).dismiss();
                return;
            case 11:
                wjf0.d((RecyclerView) obj);
                return;
            case 12:
                SearchInCommunityCatalogRootVh searchInCommunityCatalogRootVh = (SearchInCommunityCatalogRootVh) obj;
                g3a g3aVar = searchInCommunityCatalogRootVh.x;
                g3aVar.t = searchInCommunityCatalogRootVh;
                g3aVar.e();
                return;
            case 13:
                ybj0 ybj0Var = (ybj0) obj;
                ybj0Var.getClass();
                int c = dhr0.t.c(R.attr.vk_ui_text_primary_invariably);
                String str = "<u>" + ((Object) ybj0Var.f.getText()) + "</u>";
                VkOnboardingHighlighter vkOnboardingHighlighter = ybj0Var.g;
                vkOnboardingHighlighter.setHighlightVerticalPadding(0);
                vkOnboardingHighlighter.setHighlightHorizontalPadding(0);
                vkOnboardingHighlighter.setHighlighterMode(VkOnboarding$HighlighterMode.View);
                vkOnboardingHighlighter.setHighlightedTextColor(Integer.valueOf(c));
                vkOnboardingHighlighter.setText(str);
                vkOnboardingHighlighter.requestLayout();
                vkOnboardingHighlighter.d(false, null, true, null);
                return;
            case 14:
                final StoriesVideoEncoder storiesVideoEncoder = (StoriesVideoEncoder) obj;
                Handler handler = storiesVideoEncoder.i;
                Context context = storiesVideoEncoder.b;
                StoriesVideoEncoder.StoriesEncoderParameters storiesEncoderParameters = storiesVideoEncoder.d;
                AtomicBoolean atomicBoolean = storiesVideoEncoder.j;
                int i4 = 15;
                if (atomicBoolean.get()) {
                    storiesVideoEncoder.b();
                    handler.post(new nx3(storiesVideoEncoder, i4));
                    return;
                }
                hpa0 p6 = ((MediaPipelineComponent) storiesVideoEncoder.h.getValue()).p6(context);
                ArrayList arrayList = new ArrayList();
                Iterator<Integer> it = storiesEncoderParameters.e.iterator();
                while (it.hasNext()) {
                    uq10 uq10Var = ((r290) r290.b.getValue()).a.get(it.next().intValue());
                    uq10 copy = uq10Var != null ? uq10Var.copy() : null;
                    if (copy != null) {
                        arrayList.add(copy);
                    }
                }
                storiesVideoEncoder.l = arrayList;
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    uq10 uq10Var2 = (uq10) it2.next();
                    uq10Var2.f();
                    uq10Var2.b();
                }
                gpa0 build = ((hpa0) p6.c(storiesEncoderParameters.b).g(new apk(arrayList, context, null))).f(storiesVideoEncoder.g, storiesVideoEncoder.f).build();
                storiesVideoEncoder.k.set(build);
                StoriesVideoEncoder.StoriesEncoderParameters.VideoOutputSettings videoOutputSettings = storiesEncoderParameters.c;
                qpa0 c2 = build.c(new ykm0(storiesVideoEncoder.c, new TransformFormat(storiesEncoderParameters.d, new TransformFormat.VideoOutputFormat(videoOutputSettings.b, videoOutputSettings.c, null, null, null, 24, null), null), new jkp0(new com.vk.stories.c(storiesVideoEncoder))));
                if (epx.f(c2, qpa0.a.a)) {
                    if (atomicBoolean.get()) {
                        storiesVideoEncoder.b();
                        handler.post(new nx3(storiesVideoEncoder, i4));
                        return;
                    }
                    return;
                }
                if (c2 instanceof qpa0.b) {
                    final boolean z2 = ((qpa0.b) c2).b;
                    storiesVideoEncoder.b();
                    handler.post(new Runnable() { // from class: xsna.zvl0
                        @Override // java.lang.Runnable
                        public final void run() {
                            StoriesVideoEncoder storiesVideoEncoder2 = StoriesVideoEncoder.this;
                            storiesVideoEncoder2.k.set(null);
                            storiesVideoEncoder2.e.c(z2);
                        }
                    });
                    return;
                } else {
                    if (c2 instanceof qpa0.c) {
                        Throwable th = ((qpa0.c) c2).a;
                        storiesVideoEncoder.b();
                        handler.post(new at6(8, storiesVideoEncoder, th));
                        return;
                    }
                    return;
                }
            case 15:
                ((UsersDiscoverFragment) obj).lo();
                return;
            default:
                C4490p6.b((C4490p6) obj);
                return;
        }
    }

    public /* synthetic */ nf0(crl crlVar, crl.c cVar) {
        this.b = 4;
        this.c = crlVar;
    }
}
