package defpackage;

import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import android.widget.ImageView;

/* loaded from: classes15.dex */
public final class ahv extends k9v {
    public final /* synthetic */ int a = 1;
    public final Object b;
    public final Object c;

    public ahv(ImageView imageView, Integer num) {
        this.b = imageView;
        this.c = num;
    }

    @Override // defpackage.k9v
    public final void c(mav mavVar) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((mgu) obj).invoke(null);
                break;
            default:
                ImageView imageView = (ImageView) obj;
                if (fx91.c(mavVar, (Integer) this.c)) {
                    imageView.setScaleType(ImageView.ScaleType.CENTER);
                    Context context = imageView.getContext();
                    imageView.setImageDrawable(rm91.d(vqb1.e(wwg0.msg_ic_yadisk_error, context), drb1.c(jng0.messagingCommonIconsSecondaryColor, context)));
                    break;
                }
                break;
        }
    }

    @Override // defpackage.k9v
    public void e(ad7 ad7Var) {
        switch (this.a) {
            case 0:
                ((mgu) this.b).invoke(new BitmapDrawable(((bhv) this.c).f.getResources(), ad7Var.a));
                break;
        }
    }

    public ahv(mgu mguVar, bhv bhvVar) {
        this.b = mguVar;
        this.c = bhvVar;
    }
}
