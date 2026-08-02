package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.util.Log;
import com.caverock.androidsvg.SVGParseException;
import com.google.android.gms.tasks.Task;
import com.google.common.collect.ImmutableList;
import com.samsung.android.sdk.samsungpay.v2.ISSamsungPay;
import com.samsung.android.sdk.samsungpay.v2.f;
import com.ybsdk.core.common.domain.entities.ThemedImageUrlEntity;
import com.ybsdk.core.qr.scanner.ui.InteractorQrScannerView;
import com.ybsdk.core.utils.text.Text;
import com.ybsdk.core.utils.text.b;
import com.ybsdk.feature.qr.payments.api.data.PageImageHeaderEntity;
import com.ybsdk.feature.qr.payments.api.data.TryToRefreshEntity;
import com.ybsdk.widgets.common.YbButtonView;
import java.io.File;
import java.util.Arrays;
import ru.CryptoPro.JCP.tools.SelfTesterException;
import ru.yandex.taxi.fragment.preorder.RouteSelectorDestinationFragment;

/* loaded from: classes3.dex */
public final /* synthetic */ class d7g0 implements ev31, olm0, ims, t3k0, qx0, c9e, f.d, wx01, rgz, pke, r131, vls {
    public final /* synthetic */ int a;

    public /* synthetic */ d7g0(int i) {
        this.a = i;
    }

    private final void g(Object obj) {
    }

    public static /* synthetic */ void i() {
        throw new Exception();
    }

    public static /* synthetic */ void j(Object obj, String str) {
        throw new AssertionError(str + obj);
    }

    public static /* synthetic */ void k(String str) {
        throw new SVGParseException(str);
    }

    public static /* synthetic */ void m(String str, Throwable th) {
        throw new SelfTesterException(str, th);
    }

    public static /* synthetic */ void n(String str) {
        throw new SelfTesterException(str);
    }

    @Override // defpackage.wx01
    public void a() {
    }

    @Override // defpackage.c9e
    public void accept(Object obj) {
        switch (this.a) {
            case 17:
                ((syl0) obj).b.release();
                break;
        }
    }

    @Override // defpackage.ims
    /* renamed from: apply */
    public Object mo104apply(Object obj) {
        switch (this.a) {
            case 7:
                return obj;
            case 8:
                return null;
            default:
                return ImmutableList.r(Integer.valueOf(((tsb) obj).a));
        }
    }

    @Override // com.samsung.android.sdk.samsungpay.v2.f.d
    public IInterface b(IBinder iBinder) {
        return ISSamsungPay.Stub.asInterface(iBinder);
    }

    @Override // defpackage.olm0
    public nlm0 c(InteractorQrScannerView interactorQrScannerView) {
        return new fxn();
    }

    @Override // defpackage.qx0
    public boolean d() {
        boolean onAttach$lambda$3$0;
        onAttach$lambda$3$0 = RouteSelectorDestinationFragment.onAttach$lambda$3$0();
        return onAttach$lambda$3$0;
    }

    @Override // defpackage.t3k0
    public Object e() {
        switch (this.a) {
            case 11:
                return new StyleSpan(1);
            case 12:
                return new StyleSpan(2);
            default:
                return new TypefaceSpan("monospace");
        }
    }

    @Override // defpackage.rgz
    public void f(Exception exc, String str, Object[] objArr) {
        x4c.g("Exception during providesDateParser() in SdkModule", exc, String.format(str, Arrays.copyOf(new Object[]{objArr}, 1)), null, 8);
    }

    @Override // defpackage.pke
    public Object h(Task task) {
        boolean z;
        if (task.o()) {
            h3f h3fVar = (h3f) task.k();
            h3fVar.getClass();
            Log.isLoggable("FirebaseCrashlytics", 3);
            File c = h3fVar.c();
            z = true;
            if (c.delete()) {
                c.getPath();
                Log.isLoggable("FirebaseCrashlytics", 3);
            } else {
                c.getPath();
            }
        } else {
            task.j();
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.r131
    public boolean l(Object obj) {
        switch (this.a) {
            case 26:
                if (((Double) obj).doubleValue() > 0.0d) {
                }
                break;
            default:
                break;
        }
        return true;
    }

    @Override // defpackage.ev31
    public Object q(Object obj) {
        fdg0 edg0Var;
        switch (this.a) {
            case 1:
                zcg0 zcg0Var = (zcg0) obj;
                TryToRefreshEntity.Header header = zcg0Var.a;
                if (header instanceof TryToRefreshEntity.Header.Default) {
                    TryToRefreshEntity.Header.Default r2 = (TryToRefreshEntity.Header.Default) header;
                    ThemedImageUrlEntity image = r2.getValue().getImage();
                    rbv f = image != null ? job1.f(image, new cbg0(7)) : null;
                    rtz0 ptz0Var = f != null ? new ptz0(f) : qtz0.a;
                    b bVar = Text.Companion;
                    String title = r2.getValue().getTitle();
                    bVar.getClass();
                    Text.Constant constant = new Text.Constant(title);
                    String description = r2.getValue().getDescription();
                    edg0Var = new ddg0(new stz0(constant, description != null ? new Text.Constant(description) : null, null, null, null, ptz0Var, false, null, null, null, null, null, 32732));
                } else {
                    if (!(header instanceof TryToRefreshEntity.Header.Image)) {
                        w511.b();
                        return null;
                    }
                    PageImageHeaderEntity value = ((TryToRefreshEntity.Header.Image) header).getValue();
                    rbv f2 = job1.f(value.getTitleImage(), new gdf0(25));
                    ThemedImageUrlEntity cornerImage = value.getCornerImage();
                    edg0Var = new edg0(new lfv(f2, cornerImage != null ? job1.f(cornerImage, new gdf0(26)) : null, null, null, null));
                }
                return new gdg0(edg0Var, zcg0Var.b, zcg0Var.c, zcg0Var.d, new YbButtonView.a(zcg0Var.e.getText(), null, null, null, null, null, null, false, false, null, 4094));
            default:
                return gmi0.a;
        }
    }

    public /* synthetic */ d7g0(int i, Object obj) {
        this.a = i;
    }
}
