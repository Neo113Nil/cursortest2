package xsna;

import android.widget.ImageView;
import androidx.core.widget.NestedScrollView;
import com.vk.dto.common.data.VKList;
import com.vk.dto.stickers.ugc.UGCChatSettingsModel;
import java.util.List;
import kotlin.Triple;
import ru.ok.android.externcalls.sdk.stereo.StereoRoomManager;
import ru.ok.android.externcalls.sdk.stereo.StereoRoomManagerAdaptersKt;
import xsna.cvq0;
import xsna.ub9;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class sqk0 implements io.reactivex.rxjava3.functions.d, io.reactivex.rxjava3.core.d, ub9.c, io.reactivex.rxjava3.functions.l, io.reactivex.rxjava3.functions.c, NestedScrollView.d, io.reactivex.rxjava3.functions.m {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ sqk0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    public void a(int i, int i2, int i3, int i4) {
        mjw0 mjw0Var = (mjw0) this.c;
        qiu qiuVar = mjw0Var.h;
        qiuVar.e = i2;
        qiuVar.b();
        mjw0Var.e.b(i2, i4);
        mjw0Var.f.d5(i2, i4);
    }

    @Override // io.reactivex.rxjava3.functions.l
    public Object apply(Object obj) {
        switch (this.b) {
            case 3:
                return (UGCChatSettingsModel) ((emf0) this.c).invoke(obj);
            case 4:
                return (VKList) ((a720) this.c).invoke(obj);
            case 5:
                return ((cvq0.b) this.c).invoke(obj);
            default:
                return (List) ((quz) this.c).invoke(obj);
        }
    }

    @Override // xsna.ub9.c
    public Object attachCompleter(ub9.a aVar) {
        ((qoo0) this.c).j.set(aVar);
        return "textureViewImpl_waitForNextFrame";
    }

    @Override // androidx.core.widget.NestedScrollView.d
    public void c(NestedScrollView nestedScrollView, int i) {
        x2v0 x2v0Var = (x2v0) this.c;
        boolean z = i <= 0;
        ImageView imageView = x2v0Var.t;
        if (imageView == null) {
            imageView = null;
        }
        awt0.v(imageView, !z);
    }

    @Override // io.reactivex.rxjava3.core.d
    public void subscribe(io.reactivex.rxjava3.core.b bVar) {
        StereoRoomManagerAdaptersKt.rejectPromotion$lambda$0((StereoRoomManager) this.c, bVar);
    }

    @Override // io.reactivex.rxjava3.functions.d
    public boolean test(Object obj, Object obj2) {
        return ((Boolean) ((bb9) this.c).invoke(obj, obj2)).booleanValue();
    }

    @Override // io.reactivex.rxjava3.functions.m
    public boolean test(Object obj) {
        return ((Boolean) ((riw0) this.c).invoke(obj)).booleanValue();
    }

    @Override // io.reactivex.rxjava3.functions.c
    public Object apply(Object obj, Object obj2) {
        return (Triple) ((bb9) this.c).invoke(obj, obj2);
    }
}
