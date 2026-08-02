package xsna;

import android.graphics.Bitmap;
import android.support.v4.media.MediaMetadataCompat;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.api.generated.audio.dto.AudioGetStreamMixSettingsResponseDto;
import com.vk.api.generated.audio.dto.AudioStreamMixSettingsDto;
import com.vk.libvideo.api.minimizable.VideoMinimizableState;
import com.vk.newsfeed.posting.mediapicker.photovk.VkPhotoPickerFragment;
import com.vk.video.ui.discovery.minimizable.VideoMinimizableDiscoveryFragment;
import com.vk.voip.dto.RecordType;
import com.vkontakte.android.R;
import kotlin.Pair;
import xsna.di8;
import xsna.hh8;
import xsna.nt80;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class wss0 implements izs {
    public final /* synthetic */ int b;

    public /* synthetic */ wss0(int i) {
        this.b = i;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        Object obj2;
        switch (this.b) {
            case 0:
                Bitmap bitmap = (Bitmap) obj;
                return pn00.k(new Pair(MediaMetadataCompat.METADATA_KEY_DISPLAY_ICON, bitmap), new Pair(MediaMetadataCompat.METADATA_KEY_ALBUM_ART, bitmap));
            case 1:
                int i = VideoMinimizableDiscoveryFragment.p1;
                return Boolean.valueOf(com.vk.libvideo.api.minimizable.a.k((VideoMinimizableState) obj));
            case 2:
                return Boolean.valueOf(((Integer) obj).intValue() < 360);
            case 3:
                qgi0.r((tgi0) obj, "ad_banner_subtitle");
                return s3q0.a;
            case 4:
                AudioStreamMixSettingsDto d = ((AudioGetStreamMixSettingsResponseDto) obj).d();
                if (d != null) {
                    return p4v0.a(d);
                }
                return null;
            case 5:
                RecyclerView recyclerView = (RecyclerView) obj;
                int i2 = VkPhotoPickerFragment.r0;
                recyclerView.setPadding(0, 0, 0, iah0.a(8));
                recyclerView.setNestedScrollingEnabled(false);
                return s3q0.a;
            case 6:
                return new j7w0(R.layout.vmoji_character_owned_sticker_pack_loading_item, (ViewGroup) obj);
            case 7:
                com.vk.voip.ui.c.b.getClass();
                return Boolean.valueOf(com.vk.voip.ui.c.r0());
            default:
                hh8 hh8Var = (hh8) obj;
                if (hh8Var instanceof hh8.a) {
                    hh8.a aVar = (hh8.a) hh8Var;
                    nt80<dfw0> nt80Var = aVar.f;
                    if (nt80Var instanceof nt80.d) {
                        obj2 = di8.d.a;
                    } else if (nt80Var instanceof nt80.c) {
                        obj2 = new di8.a(aVar.h.a(), aVar.e, aVar.d == RecordType.RECORD, aVar.k);
                    } else {
                        obj2 = di8.c.a;
                    }
                } else {
                    obj2 = di8.c.a;
                }
                return new it80(obj2);
        }
    }

    public /* synthetic */ wss0(Object obj, int i) {
        this.b = i;
    }
}
