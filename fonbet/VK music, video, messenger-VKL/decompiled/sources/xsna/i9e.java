package xsna;

import android.os.Bundle;
import com.vk.dialogtags.impl.list.TagsListState;
import com.vk.dto.common.data.VKList;
import com.vk.dto.video.VideoAlbum;
import com.vk.instantjobs.InstantJob;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class i9e implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;

    public /* synthetic */ i9e(int i, int i2) {
        this.b = i2;
        this.c = i;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        boolean z;
        switch (this.b) {
            case 0:
                Bundle bundle = (Bundle) obj;
                dhr0.a.getClass();
                bundle.putInt("theme", dhr0.u().c);
                bundle.putInt("selection_limit", 1);
                bundle.putBoolean("single_mode", true);
                bundle.putBoolean("prevent_styling", false);
                bundle.putInt("media_type", this.c);
                bundle.putBoolean("camera_enabled", false);
                bundle.putBoolean("initialize_camera", false);
                bundle.putBoolean("enable_default_album_entries", false);
                bundle.putBoolean("prevent_styling", true);
                bundle.putBoolean("enable_orientation_locker", false);
                return s3q0.a;
            case 1:
                return Integer.valueOf(((twy) obj).getIndex() - this.c);
            case 2:
                TagsListState tagsListState = (TagsListState) obj;
                return TagsListState.a(tagsListState, null, j5g.s0(tagsListState.c, Integer.valueOf(this.c)), 5);
            case 3:
                InstantJob instantJob = (InstantJob) obj;
                if (instantJob instanceof sp6) {
                    if (this.c == ((sp6) instantJob).d) {
                        z = true;
                        return Boolean.valueOf(z);
                    }
                }
                z = false;
                return Boolean.valueOf(z);
            default:
                VKList vKList = (VKList) obj;
                ArrayList arrayList = new ArrayList(c5g.u(vKList, 10));
                Iterator<T> it = vKList.iterator();
                while (it.hasNext()) {
                    arrayList.add(new c1s0((VideoAlbum) it.next()));
                }
                return new wia0(arrayList, vKList.i(), this.c == 0);
        }
    }
}
