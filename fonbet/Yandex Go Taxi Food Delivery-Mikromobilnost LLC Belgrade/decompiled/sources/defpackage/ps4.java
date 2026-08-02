package defpackage;

import android.content.Context;
import com.yandex.mapkit.search.BitmapDownloader;
import com.yandex.mapkit.search.BitmapSession;
import com.yandex.mapkit.search.SearchFactory;
import com.yandex.mapkit.search.StorageCaching;

/* loaded from: classes7.dex */
public final class ps4 extends k45 {
    public BitmapDownloader b;
    public BitmapSession c;
    public Context w;

    @Override // defpackage.ca20
    public final void onMethodCall(x920 x920Var, da20 da20Var) {
        String str = x920Var.a;
        if (str != null) {
            int hashCode = str.hashCode();
            if (hashCode != -1592162559) {
                if (hashCode != 3237136) {
                    if (hashCode == 1282738188 && str.equals("requestImage")) {
                        if (this.b == null) {
                            ((ba20) da20Var).error("bannerImageDownloader", "Image downloader not initialized", null);
                            return;
                        }
                        String str2 = (String) x920Var.b;
                        float f = this.w.getResources().getDisplayMetrics().density;
                        BitmapSession bitmapSession = this.c;
                        if (bitmapSession != null) {
                            bitmapSession.cancel();
                        }
                        os4 os4Var = new os4((ba20) da20Var);
                        BitmapDownloader bitmapDownloader = this.b;
                        this.c = bitmapDownloader != null ? bitmapDownloader.requestBitmap(str2, f, os4Var) : null;
                        return;
                    }
                } else if (str.equals("init")) {
                    if (this.b == null) {
                        this.b = SearchFactory.getInstance().createBitmapDownloader(StorageCaching.DISABLED);
                    }
                    ((ba20) da20Var).success(null);
                    return;
                }
            } else if (str.equals("cancelImage")) {
                BitmapSession bitmapSession2 = this.c;
                if (bitmapSession2 != null) {
                    bitmapSession2.cancel();
                }
                this.c = null;
                ((ba20) da20Var).success(null);
                return;
            }
        }
        ((ba20) da20Var).notImplemented();
    }
}
