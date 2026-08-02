package defpackage;

import android.graphics.Bitmap;
import com.yandex.mapkit.search.BitmapSession;
import com.yandex.runtime.Error;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.nio.ByteBuffer;
import kotlin.Pair;
import kotlin.collections.b;

/* loaded from: classes7.dex */
public final class os4 implements BitmapSession.BitmapListener {
    public final /* synthetic */ ba20 a;

    public os4(ba20 ba20Var) {
        this.a = ba20Var;
    }

    @Override // com.yandex.mapkit.search.BitmapSession.BitmapListener
    public final void onBitmapError(Error error) {
        this.a.error("bannerImageDownloader", "error in downloading image", null);
    }

    @Override // com.yandex.mapkit.search.BitmapSession.BitmapListener
    public final void onBitmapReceived(Bitmap bitmap) {
        Pair pair = new Pair("width", Integer.valueOf(bitmap.getWidth()));
        Pair pair2 = new Pair("height", Integer.valueOf(bitmap.getHeight()));
        ByteBuffer allocate = ByteBuffer.allocate(bitmap.getByteCount());
        bitmap.copyPixelsToBuffer(allocate);
        this.a.success(b.i(pair, pair2, new Pair(Constants.KEY_DATA, allocate.array())));
    }
}
