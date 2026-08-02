package xsna;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.vk.photo.editor.views.DashedSeekBar;
import java.io.File;
import java.io.FileInputStream;
import java.nio.ByteBuffer;
import kotlin.text.Regex;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class mtk implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ mtk(Object obj, int i, int i2) {
        this.b = i2;
        this.d = obj;
        this.c = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.b;
        int i2 = this.c;
        Object obj = this.d;
        switch (i) {
            case 0:
                DashedSeekBar dashedSeekBar = (DashedSeekBar) obj;
                View view = dashedSeekBar.u;
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                if (layoutParams == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                }
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
                layoutParams2.width = i2;
                view.setLayoutParams(layoutParams2);
                View view2 = dashedSeekBar.v;
                ViewGroup.LayoutParams layoutParams3 = view2.getLayoutParams();
                if (layoutParams3 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                }
                FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) layoutParams3;
                layoutParams4.width = i2;
                view2.setLayoutParams(layoutParams4);
                return;
            default:
                pgm0 pgm0Var = (pgm0) obj;
                try {
                    File file = pgm0Var.b;
                    Regex regex = com.vk.core.files.a.a;
                    if (vhk0.g(file)) {
                        FileInputStream fileInputStream = new FileInputStream(pgm0Var.b);
                        try {
                            byte[] bArr = new byte[8];
                            fileInputStream.read(bArr);
                            int i3 = ByteBuffer.wrap(bArr).getInt();
                            fileInputStream.close();
                            if (i3 < i2) {
                                pgm0Var.a();
                            }
                        } finally {
                        }
                    }
                } finally {
                    try {
                        return;
                    } finally {
                    }
                }
                return;
        }
    }
}
