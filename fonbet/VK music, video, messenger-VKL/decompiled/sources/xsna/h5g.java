package xsna;

import android.content.Intent;
import androidx.fragment.app.FragmentActivity;
import com.vk.attachpicker.PhotoVideoAttachActivity;
import com.vk.core.fragments.FragmentImpl;
import com.vungle.ads.internal.protos.Sdk;
import io.jsonwebtoken.JwtParser;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes8.dex */
public final /* synthetic */ class h5g implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;

    public /* synthetic */ h5g(int i, int i2) {
        this.b = i2;
        this.c = i;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                ((Integer) obj).intValue();
                throw new IndexOutOfBoundsException(uqi.a("Collection doesn't contain element at index ", this.c, JwtParser.SEPARATOR_CHAR));
            default:
                FragmentImpl fragmentImpl = (FragmentImpl) obj;
                FragmentActivity activity = fragmentImpl.getActivity();
                if (activity != null) {
                    fragmentImpl.startActivityForResult(new Intent(activity, (Class<?>) PhotoVideoAttachActivity.class).putExtra("media_type", Sdk.SDKError.Reason.INVALID_WATERFALL_PLACEMENT_ID_VALUE).putExtra("type", 1).putExtra("single_mode", true).putExtra("selection_limit", 1).putExtra("camera_enabled", false).putExtra("inner_camera_enabled", false).putExtra("prevent_styling", true), this.c);
                }
                return s3q0.a;
        }
    }
}
