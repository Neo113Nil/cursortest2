package com.yandex.messaging.views;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.yandex.messaging.internal.avatar.AvatarImageView;
import defpackage.fxa1;
import defpackage.jng0;
import defpackage.k3i0;
import defpackage.lb4;
import java.util.Iterator;
import java.util.LinkedList;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u0006¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0006¢\u0006\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0017\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0016\u0010\u0019\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u0018R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\"\u0010\u001e\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u0018\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\u0011¨\u0006\""}, d2 = {"Lcom/yandex/messaging/views/AvatarStackView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "startMargin", "Lcom/yandex/messaging/internal/avatar/AvatarImageView;", "createImageView", "(I)Lcom/yandex/messaging/internal/avatar/AvatarImageView;", "count", "Lzy11;", "reserveItems", "(I)V", "Landroid/graphics/drawable/Drawable;", "drawable", "position", "setImage", "(Landroid/graphics/drawable/Drawable;I)V", "imageBias", CA20Status.STATUS_USER_I, "imageSize", "Ljava/util/LinkedList;", "Landroid/widget/ImageView;", "images", "Ljava/util/LinkedList;", "avatarBorderColor", "getAvatarBorderColor", "()I", "setAvatarBorderColor", "messaging-core-internal_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class AvatarStackView extends FrameLayout {
    public static final int $stable = 8;
    private int avatarBorderColor;
    private int imageBias;
    private int imageSize;
    private final LinkedList<ImageView> images;

    public AvatarStackView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        int i2 = lb4.a;
        this.imageBias = i2;
        int i3 = lb4.b;
        this.imageSize = i3;
        this.images = new LinkedList<>();
        this.avatarBorderColor = fxa1.c(jng0.messagingCommonIconsPrimaryColor, context).data;
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, k3i0.AvatarStackView, 0, 0);
        try {
            this.imageBias = obtainStyledAttributes.getDimensionPixelOffset(k3i0.AvatarStackView_asvImageBias, i2);
            this.imageSize = obtainStyledAttributes.getDimensionPixelSize(k3i0.AvatarStackView_asvImageSize, i3);
            obtainStyledAttributes.recycle();
            setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    private final AvatarImageView createImageView(int startMargin) {
        AvatarImageView avatarImageView = new AvatarImageView(getContext(), null, 0, 6, null);
        int i = this.imageSize;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i, i);
        layoutParams.setMarginStart(startMargin);
        avatarImageView.setLayoutParams(layoutParams);
        avatarImageView.setBorderColor(0);
        return avatarImageView;
    }

    public final int getAvatarBorderColor() {
        return this.avatarBorderColor;
    }

    public final void reserveItems(int count) {
        if (count == this.images.size()) {
            return;
        }
        int size = this.images.size();
        LinkedList<ImageView> linkedList = this.images;
        if (count <= size) {
            int size2 = linkedList.size() - count;
            for (int i = 0; i < size2; i++) {
                removeView(this.images.getLast());
                this.images.removeLast();
            }
            return;
        }
        int size3 = (count - linkedList.size()) * this.imageBias;
        Iterator<ImageView> it = this.images.iterator();
        while (it.hasNext()) {
            ImageView next = it.next();
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) next.getLayoutParams();
            layoutParams.setMarginStart(layoutParams.getMarginStart() + size3);
            next.setLayoutParams(layoutParams);
        }
        for (int size4 = (count - 1) - this.images.size(); -1 < size4; size4--) {
            AvatarImageView createImageView = createImageView(this.imageBias * size4);
            this.images.addFirst(createImageView);
            addView(createImageView);
        }
    }

    public final void setAvatarBorderColor(int i) {
        this.avatarBorderColor = i;
    }

    public final void setImage(Drawable drawable, int position) {
        this.images.get(position).setImageDrawable(drawable);
    }

    public AvatarStackView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ AvatarStackView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public AvatarStackView(Context context) {
        this(context, null, 0, 6, null);
    }
}
