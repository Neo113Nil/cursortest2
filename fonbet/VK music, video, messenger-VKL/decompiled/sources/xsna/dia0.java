package xsna;

import android.app.Activity;
import android.content.ContextWrapper;
import android.content.Intent;
import androidx.activity.ComponentActivity;
import com.vungle.ads.internal.protos.Sdk;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: PickerPhotoResultLauncherImpl.kt */
/* loaded from: classes17.dex */
public final class dia0 implements cia0 {
    public final lpj a;
    public final xcd b;
    public final hb0<Intent> c;

    /* compiled from: PickerPhotoResultLauncherImpl.kt */
    public static final /* synthetic */ class a extends FunctionReferenceImpl implements izs<Intent, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(Intent intent) {
            Intent intent2 = intent;
            ((dia0) this.receiver).getClass();
            intent2.putExtra("media_type", Sdk.SDKError.Reason.INVALID_WATERFALL_PLACEMENT_ID_VALUE);
            intent2.putExtra("camera_enabled", false);
            intent2.putExtra("clips_picker", true);
            intent2.putExtra("prevent_styling", true);
            intent2.putExtra("long_previews", true);
            intent2.putExtra("short_divider", true);
            intent2.putExtra("prevent_styling_photo", false);
            intent2.putExtra("single_mode", true);
            intent2.putExtra("big_previews", false);
            return s3q0.a;
        }
    }

    public dia0(lpj lpjVar, xcd xcdVar) {
        boolean z;
        this.a = lpjVar;
        this.b = xcdVar;
        ContextWrapper contextWrapper = lpjVar;
        while (true) {
            z = contextWrapper instanceof ComponentActivity;
            if (z || !(contextWrapper instanceof ContextWrapper)) {
                break;
            } else {
                contextWrapper = contextWrapper.getBaseContext();
            }
        }
        ComponentActivity componentActivity = (ComponentActivity) (z ? (Activity) contextWrapper : null);
        this.c = componentActivity != null ? componentActivity.registerForActivityResult(new cb0(), new eia0(this)) : null;
    }

    @Override // xsna.cia0
    public final void a() {
        rwi.d().h().a(this.a, new com.vk.movika.tools.controls.seekbar.m(this, 9), 1251, new a(1, this, dia0.class, "fillPickerIntent", "fillPickerIntent(Landroid/content/Intent;)V", 0));
    }
}
