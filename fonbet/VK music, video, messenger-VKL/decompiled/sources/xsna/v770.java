package xsna;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.facebook.drawee.generic.RoundingParams;
import com.vk.dto.notifications.NotificationEntity;
import com.vk.imageloader.ImageScreenSize;
import com.vk.imageloader.view.VKMultiImageView;
import com.vk.notifications.core.avatar.NotificationAvatarViewContainer;
import com.vkontakte.android.R;
import java.util.ArrayList;
import xsna.li70;

/* compiled from: NotificationAttachmentsView.kt */
/* loaded from: classes4.dex */
public final class v770 extends VKMultiImageView {
    public final int f;
    public final int g;
    public final int h;
    public final aq1 i;
    public int j;
    public int k;
    public ArrayList<NotificationEntity> l;

    public v770(Context context, int i, int i2, aq1 aq1Var) {
        super(context);
        this.f = i;
        this.g = i2;
        this.h = 10;
        this.i = aq1Var;
        int i3 = 0;
        while (true) {
            b();
            njt njtVar = this.b.a(i3).d;
            njtVar.getClass();
            njt njtVar2 = njtVar;
            njtVar2.u(RoundingParams.a());
            njtVar2.p(new ColorDrawable(dhr0.t.c(R.attr.vk_ui_image_placeholder)), 1);
            if (i3 == 10) {
                setOnTouchListener(new t380(this));
                return;
            }
            i3++;
        }
    }

    public final ArrayList<NotificationEntity> getAttachments() {
        return this.l;
    }

    public final int getAttachmentsCount() {
        return this.k;
    }

    public final izs<NotificationEntity, s3q0> getDoOnClick() {
        return this.i;
    }

    public final int getMaxVisibleCount() {
        return this.h;
    }

    public final int getPadding() {
        return this.g;
    }

    public final int getSize() {
        return this.f;
    }

    public final int getVisibleAttachments() {
        return this.j;
    }

    @Override // com.vk.imageloader.view.VKMultiImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int min = Math.min(this.j, this.k) - 1;
        if (min < 0 || min < 0) {
            return;
        }
        int i = 0;
        while (true) {
            Drawable d = this.b.a(i).d();
            if (d != null) {
                d.draw(canvas);
            }
            if (i == min) {
                return;
            } else {
                i++;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0021, code lost:
    
        if (r2 <= 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0023, code lost:
    
        r2 = r2 - r4;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int i3 = this.f;
        int i4 = 0;
        int i5 = this.h;
        if (i5 >= 0) {
            int i6 = 0;
            while (true) {
                this.j = i4;
                int i7 = i6 + i3;
                int i8 = this.g;
                if (i7 <= size && i4 < this.k) {
                    i6 = i6 + i8 + i3;
                    if (i4 == i5) {
                        break;
                    } else {
                        i4++;
                    }
                } else {
                    break;
                }
            }
            i4 = i6;
        }
        setMeasuredDimension(i4, i3);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        int i5 = this.h;
        if (i5 >= 0) {
            int i6 = 0;
            int i7 = 0;
            while (true) {
                this.j = i6;
                int i8 = this.f + i7;
                if (i8 <= i) {
                    Drawable d = this.b.a(i6).d();
                    if (d != null) {
                        d.setBounds(i7, 0, i8, i2);
                    }
                    i7 = this.g + i8;
                    if (i6 == i5) {
                        break;
                    } else {
                        i6++;
                    }
                } else {
                    break;
                }
            }
        }
        ArrayList<NotificationEntity> arrayList = this.l;
        if (arrayList != null) {
            setNotification(arrayList);
        }
    }

    public final void setAttachments(ArrayList<NotificationEntity> arrayList) {
        this.l = arrayList;
    }

    public final void setAttachmentsCount(int i) {
        this.k = i;
    }

    public final void setNotification(ArrayList<NotificationEntity> arrayList) {
        int i = this.h;
        int i2 = 0;
        if (arrayList == null || arrayList.isEmpty()) {
            this.l = null;
            this.k = 0;
            setVisibility(4);
            if (i >= 0) {
                while (true) {
                    g(i2, null);
                    if (i2 == i) {
                        break;
                    } else {
                        i2++;
                    }
                }
            }
        } else {
            this.l = arrayList;
            this.k = arrayList.size();
            setVisibility(0);
            if (i >= 0) {
                while (true) {
                    if (i2 >= arrayList.size() || i2 >= this.j) {
                        g(i2, null);
                    } else {
                        njt njtVar = this.b.a(i2).d;
                        njtVar.getClass();
                        njtVar.u((arrayList.get(i2).Ab() || arrayList.get(i2).zb()) ? NotificationAvatarViewContainer.c : NotificationAvatarViewContainer.d);
                        li70.b bVar = li70.R;
                        h(i2, li70.b.b(arrayList.get(i2), ImageScreenSize.SIZE_36DP));
                    }
                    if (i2 == i) {
                        break;
                    } else {
                        i2++;
                    }
                }
            }
        }
        requestLayout();
    }

    public final void setVisibleAttachments(int i) {
        this.j = i;
    }
}
