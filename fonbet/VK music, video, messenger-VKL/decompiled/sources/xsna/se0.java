package xsna;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextPaint;
import com.vk.catalog2.common.ui.mvp.holder.HeaderShowAllHighlightVh;
import com.vk.clips.coauthors.di.stub.ClipsCoauthorsComponentStub;
import com.vk.clips.viewer.impl.di.ClipsViewersSdkComponentImpl;
import com.vk.core.files.PrivateFiles;
import com.vk.core.files.PrivateSubdir;
import com.vk.core.preference.Preference;
import com.vk.ecomm.catalog.impl.di.ClassifiedsComponentImpl;
import com.vk.ecomm.market.good.GoodFragment;
import com.vk.managed_groups.impl.ManagedGroupsComponentImpl;
import com.vk.mediapicker.impl.di.MediaPickerComponentImpl;
import com.vk.profile.user.impl.ui.ModalUserProfileFragment;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.toggle.Features;
import com.vk.toggle.b;
import com.vk.toggle.features.SmbFeatures;
import com.vk.toggle.features.VideoFeatures;
import java.io.File;
import kotlin.text.Regex;
import one.video.player.BaseVideoPlayer;
import xsna.dai;
import xsna.i560;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class se0 implements gzs {
    public final /* synthetic */ int b;

    public /* synthetic */ se0(int i) {
        this.b = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x00d0, code lost:
    
        if ((r4 != null ? r4.intValue() : 0) <= android.os.Build.VERSION.SDK_INT) goto L64;
     */
    @Override // xsna.gzs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke() {
        PrivateFiles.a b;
        b.d i;
        String obj;
        boolean z = true;
        Integer num = null;
        num = null;
        num = null;
        switch (this.b) {
            case 0:
                VideoFeatures videoFeatures = VideoFeatures.VIDEO_NEW_INSTREAM_LOGIC;
                videoFeatures.getClass();
                return Boolean.valueOf(com.vk.toggle.b.A.a(videoFeatures));
            case 1:
                return s3q0.a;
            case 2:
                vw3 vw3Var = BaseVideoPlayer.H;
                return zr.a("Player is not created on the main thread.\nCurrent thread: '", Thread.currentThread().getName(), "'");
            case 3:
                return s3q0.a;
            case 4:
                return s3q0.a;
            case 5:
                return new zga();
            case 6:
                return "joinRecommendedChannel: ";
            case 7:
                qcy<Object>[] qcyVarArr = ClassifiedsComponentImpl.b;
                return new ehc();
            case 8:
                Regex regex = com.vk.core.files.a.a;
                String valueOf = String.valueOf(System.currentTimeMillis());
                PrivateFiles privateFiles = e8r.a;
                PrivateSubdir privateSubdir = PrivateSubdir.CLIPS_TEMP_DOWNLOADS;
                privateFiles.getClass();
                b = privateFiles.b(privateSubdir, privateSubdir.h(), true);
                File file = b.a;
                StringBuilder c = r11.c("TEMP_TRIM_", valueOf);
                c.append(".".concat("mp4"));
                return new File(file, c.toString());
            case 9:
                return new vga("clip_trends_discover_key");
            case 10:
                return new zzq(false);
            case 11:
                Features.Type type = Features.Type.FEATURE_CLIPS_EFFECTS_DISABLED;
                if (puq.c(type, 2)) {
                    if (!puq.b() && (i = com.vk.toggle.b.A.i(type)) != null && (obj = i.c.toString()) != null) {
                        num = arm0.m(10, obj);
                    }
                    break;
                }
                z = false;
                return Boolean.valueOf(z);
            case 12:
                qcy<Object>[] qcyVarArr2 = ClipsCoauthorsComponentStub.d;
                return new ClipsCoauthorsComponentStub.c();
            case 13:
                qcy<Object>[] qcyVarArr3 = ClipsViewersSdkComponentImpl.l;
                return new qlh0();
            case 14:
                return new dai.b();
            case 15:
                return s3q0.a;
            case 16:
                return s3q0.a;
            case 17:
                return s3q0.a;
            case 18:
                return s3q0.a;
            case 19:
                qcy<Object>[] qcyVarArr4 = GoodFragment.U0;
                SmbFeatures smbFeatures = SmbFeatures.PRODUCT_CARD_PARAMS;
                smbFeatures.getClass();
                return Boolean.valueOf(com.vk.toggle.b.A.a(smbFeatures));
            case 20:
                SchemeStat$EventItem schemeStat$EventItem = HeaderShowAllHighlightVh.D;
                Context context = e43.a;
                return Preference.h(context != null ? context : null, 0, "highlighted_headers_pref");
            case 21:
                qcy<Object>[] qcyVarArr5 = ManagedGroupsComponentImpl.d;
                return new wi00();
            case 22:
                qcy<Object>[] qcyVarArr6 = MediaPickerComponentImpl.d;
                return new pu10();
            case 23:
                Features.Type type2 = Features.Type.FEATURE_VIDEO_ENCODER_EXTENDED_LOGGING;
                type2.getClass();
                return Boolean.valueOf(com.vk.toggle.b.A.a(type2));
            case 24:
                return s3q0.a;
            case 25:
                int i2 = ModalUserProfileFragment.C0;
                return new Handler(Looper.getMainLooper());
            case 26:
                return s3q0.a;
            case 27:
                return new i560.a();
            case 28:
                TextPaint textPaint = new TextPaint();
                Context context2 = e43.a;
                if (context2 == null) {
                    context2 = null;
                }
                com.vk.typography.b.j(textPaint, context2, null, Float.valueOf(13.0f), 10);
                textPaint.setLetterSpacing(0.015f);
                return textPaint;
            default:
                return s3q0.a;
        }
    }
}
