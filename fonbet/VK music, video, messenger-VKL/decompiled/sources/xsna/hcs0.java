package xsna;

import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Icon;
import androidx.core.graphics.drawable.IconCompat;
import com.vk.clips.viewer.impl.adapters.VideoFileAdapter;
import com.vk.dto.common.Image;
import com.vk.dto.newsfeed.entries.Post;
import com.vk.voip.ui.calls.presentation.base.fragment.VoipCallServiceFragment;
import java.util.ArrayList;
import java.util.List;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class hcs0 implements izs {
    public final /* synthetic */ int b;

    public /* synthetic */ hcs0(int i) {
        this.b = i;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                return Boolean.valueOf(((it80) obj).a());
            case 1:
                Image image = (Image) obj;
                qcy<Object>[] qcyVarArr = VideoFileAdapter.l;
                if (image != null) {
                    return fz5.C(image);
                }
                return null;
            case 2:
                return s3q0.a;
            case 3:
                return io.reactivex.rxjava3.core.q.T(Boolean.TRUE);
            case 4:
                int i = VoipCallServiceFragment.Y;
                qgi0.r((tgi0) obj, "VoipCallService.Back");
                return s3q0.a;
            case 5:
                Icon createWithBitmap = Icon.createWithBitmap((Bitmap) obj);
                PorterDuff.Mode mode = IconCompat.k;
                return IconCompat.a.a(createWithBitmap);
            case 6:
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : (List) obj) {
                    if (obj2 instanceof Post) {
                        arrayList.add(obj2);
                    }
                }
                return arrayList;
            default:
                return io.reactivex.rxjava3.core.a.k(new RuntimeException("Timeout: initialization flag was not set to true within 3000 ms"));
        }
    }
}
