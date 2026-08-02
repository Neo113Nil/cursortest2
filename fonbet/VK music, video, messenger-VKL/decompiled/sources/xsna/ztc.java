package xsna;

import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import com.vk.clips.viewer.edit.api.domain.model.ClipEditSdkItem;
import com.vk.voip.OKVoipEngine;
import java.util.List;
import ru.ok.android.externcalls.sdk.sessionroom.SessionRoomsManager;
import ru.ok.android.webrtc.sessionroom.admin.RemoveRoomsParams;
import xsna.xtc;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class ztc implements pcs, io.reactivex.rxjava3.core.d {
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ztc(Object obj, Object obj2) {
        this.b = obj;
        this.c = obj2;
    }

    @Override // xsna.pcs
    public void p(Bundle bundle, String str) {
        Parcelable parcelable;
        Object parcelable2;
        xtc.a aVar = (xtc.a) this.b;
        izs izsVar = (izs) this.c;
        if (Build.VERSION.SDK_INT >= 33) {
            parcelable2 = bundle.getParcelable("clip_edit_bundle_result", ClipEditSdkItem.class);
            parcelable = (Parcelable) parcelable2;
        } else {
            Parcelable parcelable3 = bundle.getParcelable("clip_edit_bundle_result");
            if (!(parcelable3 instanceof ClipEditSdkItem)) {
                parcelable3 = null;
            }
            parcelable = (ClipEditSdkItem) parcelable3;
        }
        ClipEditSdkItem clipEditSdkItem = (ClipEditSdkItem) parcelable;
        if (clipEditSdkItem != null) {
            izsVar.invoke(clipEditSdkItem);
        }
        aVar.b.f("clip_edit_result");
    }

    @Override // io.reactivex.rxjava3.core.d
    public void subscribe(io.reactivex.rxjava3.core.b bVar) {
        com.vk.voip.ui.sessionrooms.d dVar = (com.vk.voip.ui.sessionrooms.d) this.b;
        List list = (List) this.c;
        dVar.a.getClass();
        SessionRoomsManager D = OKVoipEngine.D();
        if (D != null) {
            D.removeRooms(new RemoveRoomsParams.Builder().setRoomIds(list).build(), new vv20(bVar, 23), new p010(bVar, 27));
        }
    }
}
