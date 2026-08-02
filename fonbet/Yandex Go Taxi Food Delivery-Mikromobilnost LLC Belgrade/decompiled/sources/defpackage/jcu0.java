package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.TextView;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.yandex.messaging.core.net.entities.StickerPacksData;
import com.yandex.messaging.internal.view.stickers.bottomsheet.StickerPanelBottomSheet;

/* loaded from: classes15.dex */
public final class jcu0 implements e1k, xs21 {
    public final String a;
    public final Handler b;
    public scu0 c;
    public kdu0 w;
    public final /* synthetic */ kcu0 x;

    public jcu0(kcu0 kcu0Var, String str, scu0 scu0Var) {
        this.x = kcu0Var;
        Handler handler = new Handler((Looper) kcu0Var.a.get());
        this.b = handler;
        tje.e();
        this.a = str;
        this.c = scu0Var;
        handler.post(new icu0(this, 0));
    }

    public final void a(boolean z) {
        String str;
        String str2;
        tje.e();
        final scu0 scu0Var = this.c;
        if (scu0Var != null) {
            final BottomSheetDialog bottomSheetDialog = scu0Var.c;
            final String str3 = scu0Var.b;
            StickerPanelBottomSheet stickerPanelBottomSheet = scu0Var.d;
            TextView textView = scu0Var.a;
            if (z) {
                str2 = stickerPanelBottomSheet.mDeleteText;
                textView.setText(str2);
                final int i = 0;
                textView.setOnClickListener(new View.OnClickListener() { // from class: rcu0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        cdu0 cdu0Var;
                        cdu0 cdu0Var2;
                        int i2 = i;
                        BottomSheetDialog bottomSheetDialog2 = bottomSheetDialog;
                        String str4 = str3;
                        scu0 scu0Var2 = scu0Var;
                        switch (i2) {
                            case 0:
                                cdu0Var = scu0Var2.d.mStickersActions;
                                b00 b00Var = cdu0Var.a;
                                ((Handler) b00Var.a.get()).post(new jz(b00Var, str4, 1));
                                bottomSheetDialog2.dismiss();
                                break;
                            default:
                                cdu0Var2 = scu0Var2.d.mStickersActions;
                                b00 b00Var2 = cdu0Var2.a;
                                ((Handler) b00Var2.a.get()).post(new jz(b00Var2, str4, 0));
                                bottomSheetDialog2.dismiss();
                                break;
                        }
                    }
                });
                return;
            }
            str = stickerPanelBottomSheet.mAddText;
            textView.setText(str);
            final int i2 = 1;
            textView.setOnClickListener(new View.OnClickListener() { // from class: rcu0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    cdu0 cdu0Var;
                    cdu0 cdu0Var2;
                    int i22 = i2;
                    BottomSheetDialog bottomSheetDialog2 = bottomSheetDialog;
                    String str4 = str3;
                    scu0 scu0Var2 = scu0Var;
                    switch (i22) {
                        case 0:
                            cdu0Var = scu0Var2.d.mStickersActions;
                            b00 b00Var = cdu0Var.a;
                            ((Handler) b00Var.a.get()).post(new jz(b00Var, str4, 1));
                            bottomSheetDialog2.dismiss();
                            break;
                        default:
                            cdu0Var2 = scu0Var2.d.mStickersActions;
                            b00 b00Var2 = cdu0Var2.a;
                            ((Handler) b00Var2.a.get()).post(new jz(b00Var2, str4, 0));
                            bottomSheetDialog2.dismiss();
                            break;
                    }
                }
            });
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, defpackage.xs21
    public final void close() {
        tje.e();
        this.c = null;
        this.b.post(new icu0(this, 1));
    }

    @Override // defpackage.xs21
    public final e1k e(cl21 cl21Var) {
        kcu0 kcu0Var = this.x;
        z83.g(null, kcu0Var.a.get(), Looper.myLooper());
        odu0 odu0Var = kcu0Var.c;
        String str = this.a;
        StickerPacksData.PackData a = odu0Var.a(str);
        boolean c = kcu0Var.b.b.r().c(str);
        Handler handler = kcu0Var.e;
        handler.post(new rg3(this, c, 11));
        if (a != null) {
            handler.post(new tpt0(5, this, a));
        } else {
            ldu0 ldu0Var = (ldu0) ((d9g) cl21Var).B0.get();
            ykn0 ykn0Var = new ykn0(22, this);
            ldu0Var.getClass();
            this.w = new kdu0(ldu0Var, str, ykn0Var);
        }
        return this.w;
    }
}
