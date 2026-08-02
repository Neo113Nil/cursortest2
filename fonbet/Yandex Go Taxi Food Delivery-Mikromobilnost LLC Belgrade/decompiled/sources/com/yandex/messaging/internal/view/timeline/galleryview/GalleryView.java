package com.yandex.messaging.internal.view.timeline.galleryview;

import android.content.Context;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.r0;
import com.yandex.messaging.core.net.entities.proto.message.PlainMessage;
import com.yandex.messaging.views.GalleryRoundImageView;
import defpackage.ase;
import defpackage.ass;
import defpackage.bss;
import defpackage.d6w;
import defpackage.dss;
import defpackage.e9h0;
import defpackage.gvg0;
import defpackage.kjs0;
import defpackage.ors;
import defpackage.tj91;
import defpackage.ure;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

@Metadata(d1 = {"\u0000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007*\u0001*\b\u0007\u0018\u00002\u00020\u0001:\u0001-B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\f\u001a\u00020\u000b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J#\u0010\u0014\u001a\u00020\u000b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0018\u001a\u00020\u000b¢\u0006\u0004\b\u0018\u0010\u0019J\u0019\u0010\u001d\u001a\u00020\u000b2\n\u0010\u001c\u001a\u00060\u001aj\u0002`\u001b¢\u0006\u0004\b\u001d\u0010\u001eR.\u0010!\u001a\u0004\u0018\u00010\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u001f8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u0014\u0010(\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010+\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0018\u0010.\u001a\u00060-R\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0017\u00100\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103¨\u00064"}, d2 = {"Lcom/yandex/messaging/internal/view/timeline/galleryview/GalleryView;", "Landroidx/recyclerview/widget/RecyclerView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "Lcom/yandex/messaging/core/net/entities/proto/message/PlainMessage$Item;", "items", "Lzy11;", "setImages", "([Lcom/yandex/messaging/core/net/entities/proto/message/PlainMessage$Item;)V", "", "imageCount", "setConfiguration", "(I)V", "", "sent", "bindView", "([Lcom/yandex/messaging/core/net/entities/proto/message/PlainMessage$Item;Z)V", "getSmallImageHeight", "()Ljava/lang/Integer;", "cleanup", "()V", "Lase;", "Lcom/yandex/messaging/internal/view/timeline/galleryview/CornersRadii;", "radii", "setRounds", "(Lase;)V", "Lors;", "value", "galleryAdapter", "Lors;", "getGalleryAdapter", "()Lors;", "setGalleryAdapter", "(Lors;)V", "Lure;", "cornerRadiiController", "Lure;", "com/yandex/messaging/internal/view/timeline/galleryview/GalleryView$galleryLayoutManager$1", "galleryLayoutManager", "Lcom/yandex/messaging/internal/view/timeline/galleryview/GalleryView$galleryLayoutManager$1;", "Lbss;", "spanSizeLookup", "Lbss;", "imagePadding", CA20Status.STATUS_USER_I, "getImagePadding", "()I", "messaging-core-internal_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class GalleryView extends RecyclerView {
    public static final int $stable = 8;
    private final ure cornerRadiiController;
    private ors galleryAdapter;
    private final GalleryView$galleryLayoutManager$1 galleryLayoutManager;
    private final int imagePadding;
    private final bss spanSizeLookup;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v1, types: [androidx.recyclerview.widget.GridLayoutManager, androidx.recyclerview.widget.RecyclerView$e, com.yandex.messaging.internal.view.timeline.galleryview.GalleryView$galleryLayoutManager$1] */
    public GalleryView(final Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        ?? r6 = new GridLayoutManager(context) { // from class: com.yandex.messaging.internal.view.timeline.galleryview.GalleryView$galleryLayoutManager$1
            @Override // androidx.recyclerview.widget.GridLayoutManager, androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.e
            public final void U0(r0 r0Var, RecyclerView.k kVar) {
                super.U0(r0Var, kVar);
                View X = X(0);
                if (X != null) {
                    GalleryRoundImageView galleryRoundImageView = (GalleryRoundImageView) X.findViewById(e9h0.gallery_item_view);
                    int dimensionPixelOffset = this.getResources().getDimensionPixelOffset(gvg0.timeline_message_corner_radius_attachment);
                    if (galleryRoundImageView.getIsSmall()) {
                        X.setPadding(dimensionPixelOffset, 0, dimensionPixelOffset, 0);
                    } else {
                        X.setPadding(0, 0, 0, 0);
                    }
                }
            }

            @Override // androidx.recyclerview.widget.GridLayoutManager, androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.e
            public final boolean y1() {
                return false;
            }
        };
        this.galleryLayoutManager = r6;
        d6w d6wVar = new d6w(-1, -1, 1);
        bss bssVar = new bss();
        bssVar.d = 1;
        bssVar.e = 1;
        bssVar.f = d6wVar;
        this.spanSizeLookup = bssVar;
        int b = kjs0.b(2);
        this.imagePadding = b;
        setLayoutManager(r6);
        r6.h0 = bssVar;
        addItemDecoration(new ass(this));
        int i = -b;
        setPadding(0, 0, i, i);
        TypedValue typedValue = new TypedValue();
        TypedValue typedValue2 = new TypedValue();
        context.getResources().getValue(gvg0.inner_container_small_radii, typedValue, true);
        context.getResources().getValue(gvg0.inner_container_bare_radii, typedValue2, true);
        this.cornerRadiiController = new ure((int) typedValue.getFloat(), (int) typedValue2.getFloat());
    }

    private final void setConfiguration(int imageCount) {
        bss bssVar = this.spanSizeLookup;
        bssVar.d = 1;
        bssVar.e = 1;
        bssVar.f = new d6w(-1, -1, 1);
        switch (imageCount) {
            case 1:
                s2(1);
                break;
            case 2:
                s2(2);
                break;
            case 3:
                s2(2);
                bss bssVar2 = this.spanSizeLookup;
                bssVar2.e = 2;
                bssVar2.f = new d6w(0, 0, 1);
                break;
            case 4:
                s2(2);
                break;
            case 5:
            case 8:
                s2(6);
                bss bssVar3 = this.spanSizeLookup;
                bssVar3.d = 2;
                bssVar3.e = 3;
                bssVar3.f = new d6w(0, 1, 1);
                break;
            case 6:
                s2(3);
                break;
            case 7:
            case 10:
                s2(6);
                bss bssVar4 = this.spanSizeLookup;
                bssVar4.d = 2;
                bssVar4.e = 3;
                bssVar4.f = new d6w(0, 3, 1);
                break;
            case 9:
                s2(3);
                break;
        }
    }

    private final void setImages(PlainMessage.Item[] items) {
        setConfiguration(items.length);
        ors orsVar = this.galleryAdapter;
        if (orsVar != null) {
            orsVar.y = items;
            int length = items.length;
            orsVar.z = (length == 1 || length == 3) ? 0 : -1;
            orsVar.notifyDataSetChanged();
        }
    }

    public final void bindView(PlainMessage.Item[] items, boolean sent) {
        ase aseVar;
        ors orsVar = this.galleryAdapter;
        if (orsVar != null) {
            orsVar.x = sent;
        }
        ure ureVar = this.cornerRadiiController;
        int length = items.length;
        ureVar.getClass();
        switch (length) {
            case 1:
                aseVar = new ase(0, 0, 0, 0);
                break;
            case 2:
                aseVar = new ase(0, 1, 1, 0);
                break;
            case 3:
                aseVar = new ase(0, 0, 2, 1);
                break;
            case 4:
                aseVar = new ase(0, 1, 3, 2);
                break;
            case 5:
                aseVar = new ase(0, 1, 4, 0);
                break;
            case 6:
                aseVar = new ase(0, 2, 5, 3);
                break;
            case 7:
                aseVar = new ase(0, 1, 6, 4);
                break;
            case 8:
                aseVar = new ase(0, 1, 7, 5);
                break;
            case 9:
                aseVar = new ase(0, 2, 8, 6);
                break;
            case 10:
                aseVar = new ase(0, 1, 9, 7);
                break;
            default:
                aseVar = new ase(0, 1, 9, 7);
                break;
        }
        ureVar.d = aseVar;
        setImages(items);
    }

    public final void cleanup() {
        ors orsVar = this.galleryAdapter;
        if (orsVar != null) {
            orsVar.y = new PlainMessage.Item[0];
            orsVar.z = -1;
            orsVar.notifyDataSetChanged();
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            dss dssVar = (dss) getChildViewHolder(getChildAt(i));
            dssVar.P.a();
            dssVar.Q = null;
        }
    }

    public final ors getGalleryAdapter() {
        return this.galleryAdapter;
    }

    public final int getImagePadding() {
        return this.imagePadding;
    }

    public final Integer getSmallImageHeight() {
        if (getChildCount() == 0) {
            return null;
        }
        dss dssVar = (dss) getChildViewHolder(getChildAt(0));
        if (dssVar.O.getIsSmall()) {
            return Integer.valueOf(dssVar.a.getMeasuredHeight());
        }
        return null;
    }

    public final void setGalleryAdapter(ors orsVar) {
        this.galleryAdapter = orsVar;
        setAdapter(orsVar);
    }

    public final void setRounds(ase radii) {
        this.cornerRadiiController.c = radii;
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            ure ureVar = this.cornerRadiiController;
            boolean b = tj91.b(this);
            int i2 = ureVar.b;
            int i3 = ureVar.a;
            ase aseVar = new ase(i3, i3, i3, i3);
            ase aseVar2 = ureVar.d;
            if (b) {
                aseVar2 = aseVar2.a();
            }
            if (i == aseVar2.a) {
                aseVar.a = Math.min(ureVar.c.a, i2);
            }
            if (i == aseVar2.b) {
                aseVar.b = Math.min(ureVar.c.b, i2);
            }
            if (i == aseVar2.c) {
                aseVar.c = Math.min(ureVar.c.c, i2);
            }
            if (i == aseVar2.d) {
                aseVar.d = Math.min(ureVar.c.d, i2);
            }
            ((dss) getChildViewHolder(getChildAt(i))).O.setCornerRadiiDp(aseVar);
        }
    }

    public /* synthetic */ GalleryView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }
}
