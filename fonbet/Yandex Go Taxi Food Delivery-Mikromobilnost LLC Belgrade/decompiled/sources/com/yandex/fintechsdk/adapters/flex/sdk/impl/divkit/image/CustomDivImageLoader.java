package com.yandex.fintechsdk.adapters.flex.sdk.impl.divkit.image;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.widget.ImageView;
import coil.a;
import coil.b;
import coil.c;
import defpackage.bev;
import defpackage.btk;
import defpackage.evu0;
import defpackage.gjf;
import defpackage.gtk;
import defpackage.hxy;
import defpackage.ixw0;
import defpackage.jac;
import defpackage.jl40;
import defpackage.qav;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0013\u0010\f\u001a\u00020\u000b*\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0012\u0010\u0016J\u001f\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0017\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0018R\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"Lcom/yandex/fintechsdk/adapters/flex/sdk/impl/divkit/image/CustomDivImageLoader;", "Lgtk;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "name", "Landroid/graphics/drawable/Drawable;", "loadImageFromResources", "(Ljava/lang/String;)Landroid/graphics/drawable/Drawable;", "Lbev;", "addWebpHeaders", "(Lbev;)Lbev;", "imageUrl", "Lbtk;", "callback", "Lhxy;", "loadImage", "(Ljava/lang/String;Lbtk;)Lhxy;", "Landroid/widget/ImageView;", "imageView", "(Ljava/lang/String;Landroid/widget/ImageView;)Lhxy;", "loadImageBytes", "Landroid/content/Context;", "Lqav;", "imageLoader", "Lqav;", "Companion", "impl-18-1-0_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class CustomDivImageLoader implements gtk {
    private static final Companion Companion = new Companion(null);
    private static final String HEADER_ACCEPT = "Accept";
    private static final String HEADER_ACCEPT_VALUE = "image/webp,image/jpeg,image/png";
    private static final String RESOURCE_TYPE_DRAWABLE = "drawable";
    private static final String RES_SCHEME = "drawable_res";
    private final Context context;
    private final qav imageLoader;

    public CustomDivImageLoader(Context context) {
        this.context = context;
        b bVar = new b(context);
        a.C0028a c0028a = new a.C0028a();
        c0028a.e.add(new ixw0(0));
        bVar.f = c0028a.c();
        this.imageLoader = bVar.a();
    }

    private final bev addWebpHeaders(bev bevVar) {
        bevVar.a();
        return bevVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void loadImage$lambda$1() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void loadImage$lambda$3() {
    }

    private final Drawable loadImageFromResources(String name) {
        Resources resources = this.context.getResources();
        return resources.getDrawable(resources.getIdentifier(name, RESOURCE_TYPE_DRAWABLE, this.context.getPackageName()));
    }

    @Override // defpackage.gtk
    @Deprecated
    public /* bridge */ /* synthetic */ Boolean hasSvgSupport() {
        return Boolean.FALSE;
    }

    @Override // defpackage.gtk
    public hxy loadAnimatedImage(String str, btk btkVar) {
        return loadImageBytes(str, btkVar);
    }

    @Override // defpackage.gtk
    public hxy loadImage(String imageUrl, btk callback) {
        bev bevVar;
        if (evu0.J(imageUrl)) {
            return new gjf(1);
        }
        Uri parse = Uri.parse(imageUrl);
        String host = parse.getHost();
        if (!jl40.l(parse.getScheme(), RES_SCHEME) || host == null) {
            bevVar = new bev(this.context);
            bevVar.f(imageUrl);
        } else {
            Drawable loadImageFromResources = loadImageFromResources(host);
            bevVar = new bev(this.context);
            bevVar.f(loadImageFromResources);
        }
        CoilDownloadCallback coilDownloadCallback = new CoilDownloadCallback(parse, callback);
        bevVar.b();
        bevVar.h(coilDownloadCallback);
        bevVar.c(false);
        return new jac(((c) this.imageLoader).b(addWebpHeaders(bevVar).d()), 2);
    }

    @Override // defpackage.gtk
    public hxy loadImageBytes(String imageUrl, btk callback) {
        return loadImage(imageUrl, callback);
    }

    @Override // defpackage.gtk
    public /* bridge */ /* synthetic */ boolean needLimitBitmapSize() {
        return true;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/yandex/fintechsdk/adapters/flex/sdk/impl/divkit/image/CustomDivImageLoader$Companion;", "", "<init>", "()V", "HEADER_ACCEPT", "", "HEADER_ACCEPT_VALUE", "RES_SCHEME", "RESOURCE_TYPE_DRAWABLE", "impl-18-1-0_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* loaded from: classes10.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public hxy loadAnimatedImage(String str, btk btkVar, int i) {
        return loadAnimatedImage(str, btkVar);
    }

    @Override // defpackage.gtk
    @Deprecated
    public hxy loadImageBytes(String str, btk btkVar, int i) {
        return loadImageBytes(str, btkVar);
    }

    @Override // defpackage.gtk
    public hxy loadImage(String imageUrl, ImageView imageView) {
        if (evu0.J(imageUrl)) {
            return new gjf(0);
        }
        qav qavVar = this.imageLoader;
        bev bevVar = new bev(imageView.getContext());
        bevVar.f(imageUrl);
        bevVar.o(imageView);
        return new jac(((c) qavVar).b(bevVar.d()), 1);
    }

    @Override // defpackage.gtk
    public hxy loadImage(String str, btk btkVar, int i) {
        return loadImage(str, btkVar);
    }
}
