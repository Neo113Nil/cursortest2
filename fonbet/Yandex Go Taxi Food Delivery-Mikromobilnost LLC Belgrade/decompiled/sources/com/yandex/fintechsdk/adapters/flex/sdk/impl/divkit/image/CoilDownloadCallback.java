package com.yandex.fintechsdk.adapters.flex.sdk.impl.divkit.image;

import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import coil.graphics.DataSource;
import com.yandex.div.core.images.BitmapSource;
import com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.TarifficatorScenarioActivity;
import defpackage.bd7;
import defpackage.btk;
import defpackage.fev;
import defpackage.hev;
import defpackage.n9o;
import defpackage.u3v0;
import defpackage.w511;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\n\u001a\u00020\t*\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0017¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0014\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u0013H\u0017¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0016R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0017¨\u0006\u0018"}, d2 = {"Lcom/yandex/fintechsdk/adapters/flex/sdk/impl/divkit/image/CoilDownloadCallback;", "Lfev;", "Landroid/net/Uri;", "imageUri", "Lbtk;", "callback", "<init>", "(Landroid/net/Uri;Lbtk;)V", "Lcoil/decode/DataSource;", "Lcom/yandex/div/core/images/BitmapSource;", "toBitmapSource", "(Lcoil/decode/DataSource;)Lcom/yandex/div/core/images/BitmapSource;", "Lhev;", "request", "Ln9o;", TarifficatorScenarioActivity.RESULT_KEY, "Lzy11;", "onError", "(Lhev;Ln9o;)V", "Lu3v0;", "onSuccess", "(Lhev;Lu3v0;)V", "Landroid/net/Uri;", "Lbtk;", "impl-18-1-0_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class CoilDownloadCallback implements fev {
    private final btk callback;
    private final Uri imageUri;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DataSource.values().length];
            try {
                iArr[DataSource.MEMORY_CACHE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DataSource.MEMORY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[DataSource.DISK.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[DataSource.NETWORK.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public CoilDownloadCallback(Uri uri, btk btkVar) {
        this.imageUri = uri;
        this.callback = btkVar;
    }

    private final BitmapSource toBitmapSource(DataSource dataSource) {
        int i = WhenMappings.$EnumSwitchMapping$0[dataSource.ordinal()];
        if (i != 1 && i != 2) {
            if (i == 3) {
                return BitmapSource.DISK;
            }
            if (i == 4) {
                return BitmapSource.NETWORK;
            }
            w511.b();
            return null;
        }
        return BitmapSource.MEMORY;
    }

    @Override // defpackage.fev
    public void onCancel(hev hevVar) {
    }

    @Override // defpackage.fev
    public void onError(hev request, n9o result) {
        this.callback.c();
    }

    @Override // defpackage.fev
    public void onStart(hev hevVar) {
    }

    @Override // defpackage.fev
    public void onSuccess(hev request, u3v0 result) {
        this.callback.g(new bd7(((BitmapDrawable) result.a).getBitmap(), null, this.imageUri, toBitmapSource(result.c)));
    }
}
