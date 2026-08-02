package xsna;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.vk.bridges.di.BridgeComponent;
import com.vk.clips.design.view.preview.ClipsVideoAndPhotoView;
import com.vk.clips.editor.templates.api.di.ClipsTemplatesEditorComponent;
import com.vk.clips.tool.view.newsfeed.overlay.ClipEndOverlayView;
import com.vk.core.view.components.picture.VkImage;
import com.vk.core.view.components.text.VkText;
import com.vk.dto.common.ImageSize;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.id.UserId;
import com.vk.ecomm.clipproductattaches.di.ClipProductAttachesComponent;
import com.vk.im.chat.api.ChatComponent;
import com.vk.im.ui.fragments.chat.ChatFragment;
import com.vk.imageloader.ImageScreenSize;
import com.vk.photos.root.albumdetails.presentation.i;
import com.vk.photos.root.archive.presentation.ArchiveFragment;
import com.vk.profile.community.impl.ui.profile.actions.CommunityProfileAction;
import com.vk.video.ui.albums.fragments.AbsVideoListFragment;
import com.vkontakte.android.R;
import java.util.HashSet;
import ru.ok.android.externcalls.sdk.analytics.CallAnalyticsInitializer;
import xsna.f24;
import xsna.kh1;
import xsna.qfa0;
import xsna.r2c;
import xsna.xf8;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class ic implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ic(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Type inference failed for: r0v56, types: [xsna.j8i, xsna.xwb$a] */
    /* JADX WARN: Type inference failed for: r0v75, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v20, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        Integer init$lambda$4;
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                AbsVideoListFragment.e eVar = (AbsVideoListFragment.e) obj;
                VkImage vkImage = eVar.r;
                Context context = eVar.itemView.getContext();
                HashSet hashSet = iah0.a;
                ImageSize Cb = ((VideoFile) eVar.m).getImage().Cb((fnj.d(context) ? ImageScreenSize.BIG : ImageScreenSize.SMALL).h(), true, false);
                vkImage.clear();
                vkImage.o0(Cb == null ? null : Cb.d.d, null);
                vkImage.setVisibility(0);
                eVar.t.setVisibility(8);
                VkText vkText = eVar.q;
                vkText.setVisibility(TextUtils.isEmpty(vkText.getText()) ? 8 : 0);
                return s3q0.a;
            case 1:
                return ((zh) obj).j;
            case 2:
                s9l s9lVar = ((com.vk.superapp.advertisement.b) obj).a;
                return new w31(s9lVar.a, s9lVar.b);
            case 3:
                ((gg1) obj).p.b(new i.k(kh1.c.a));
                return s3q0.a;
            case 4:
                return new PorterDuffColorFilter(g2u0.a(R.color.vk_black_alpha24, (li1) obj), PorterDuff.Mode.SRC_ATOP);
            case 5:
                return Float.valueOf(((s600) obj).getProgress());
            case 6:
                yp80 yp80Var = (yp80) obj;
                if (yp80Var != null) {
                    yp80Var.onSuccess();
                }
                return s3q0.a;
            case 7:
                ArchiveFragment archiveFragment = (ArchiveFragment) obj;
                int i2 = ArchiveFragment.e0;
                return (qfa0.d) archiveFragment.fo().F4().c((UserId) archiveFragment.Q.getValue()).h.getValue();
            case 8:
                return (GradientDrawable) m33.a(R.drawable.bg_story_edit_skeleton, (l7s) obj);
            case 9:
                ((wf8) obj).d(xf8.i.a);
                return s3q0.a;
            case 10:
                return Integer.valueOf(((fx8) obj).c.e() * 1000);
            case 11:
                init$lambda$4 = CallAnalyticsInitializer.init$lambda$4((i70) obj);
                return init$lambda$4;
            case 12:
                PackageManager packageManager = ((Context) ((hj9) obj).a.invoke()).getPackageManager();
                return Integer.valueOf((packageManager.hasSystemFeature("android.hardware.camera") ? 1 : 0) + (packageManager.hasSystemFeature("android.hardware.camera.front") ? 1 : 0));
            case 13:
                return (ClipsTemplatesEditorComponent) ((nmg0) obj).a(fpf0.a(ClipsTemplatesEditorComponent.class));
            case 14:
                return ((ChatComponent) m7m.d(((yw9) obj).d).a(fpf0.a(ChatComponent.class))).Cf();
            case 15:
                return new kba(((j5a) obj).a, 6);
            case 16:
                ((gza) obj).b().e();
                return s3q0.a;
            case 17:
                ChatFragment.d dVar = ChatFragment.w1;
                return ((BridgeComponent) m7m.d((ChatFragment) obj).a(fpf0.a(BridgeComponent.class))).x().a();
            case 18:
                ((xwb) obj).b.n();
                return s3q0.a;
            case 19:
                ((q5c) obj).b.a(new r2c.x(false));
                return s3q0.a;
            case 20:
                return new wqc((oqc) ((tqc) obj).E.getValue());
            case 21:
                int i3 = ClipEndOverlayView.u;
                return (ConstraintLayout) ((ClipEndOverlayView) obj).findViewById(R.id.attach_clip_end_overlay_container);
            case 22:
                return o1d.D((o1d) obj);
            case 23:
                cfd cfdVar = (cfd) obj;
                return ((ClipProductAttachesComponent) ((k7m) m7m.f(cfdVar)).mo408a(fpf0.a(ClipProductAttachesComponent.class))).C0(cfdVar.itemView.getContext(), false, f24.b.a);
            case 24:
                return (ClipsVideoAndPhotoView) ((cmd) obj).findViewById(R.id.preview);
            case 25:
                r2f r2fVar = ((q2f) obj).a;
                return new sfh0((bfh0) r2fVar.k.getValue(), (dfh0) r2fVar.j.getValue());
            case 26:
                utx0 utx0Var = (utx0) obj;
                boolean booleanValue = utx0Var.e.getValue(utx0Var, utx0.h[0]).booleanValue();
                Paint paint = utx0Var.b.a;
                int i4 = booleanValue ? 250 : 0;
                return f5f.z(paint.getAlpha(), i4, ((long) Math.abs((i4 - r0) / 250)) * 250);
            case 27:
                ((izg) obj).b.invoke();
                return s3q0.a;
            case 28:
                ((d4h) obj).i.invoke(CommunityProfileAction.n.e.b.b);
                return s3q0.a;
            default:
                return new afh(((lrh) obj).s());
        }
    }

    public /* synthetic */ ic(f5f f5fVar, utx0 utx0Var) {
        this.b = 26;
        this.c = utx0Var;
    }
}
