package xsna;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.v4.media.MediaBrowserCompat;
import android.support.v4.media.MediaDescriptionCompat;
import com.vk.catalog2.common.dto.style.CatalogTabStyle;
import com.vk.catalog2.common.dto.ui.UIBlockCatalog;
import com.vk.catalog2.common.dto.ui.UIBlockList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.s22;

/* compiled from: AndroidAutoUIBuilderImpl.kt */
@b6l(c = "com.vk.catalog2.common.ui.mvp.auto.ui.AndroidAutoUIBuilderImpl$mapCatalog$1", f = "AndroidAutoUIBuilderImpl.kt", l = {173}, m = "invokeSuspend")
/* loaded from: classes16.dex */
public final class t22 extends SuspendLambda implements wzs<yvj, spj<? super List<? extends MediaBrowserCompat.MediaItem>>, Object> {
    final /* synthetic */ UIBlockCatalog $block;
    final /* synthetic */ String $groupBy;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ s22 this$0;

    /* compiled from: AndroidAutoUIBuilderImpl.kt */
    @b6l(c = "com.vk.catalog2.common.ui.mvp.auto.ui.AndroidAutoUIBuilderImpl$mapCatalog$1$1$1", f = "AndroidAutoUIBuilderImpl.kt", l = {}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements wzs<yvj, spj<? super MediaBrowserCompat.MediaItem>, Object> {
        final /* synthetic */ String $groupBy;
        final /* synthetic */ UIBlockList $section;
        int label;
        final /* synthetic */ s22 this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(UIBlockList uIBlockList, s22 s22Var, String str, spj<? super a> spjVar) {
            super(2, spjVar);
            this.$section = uIBlockList;
            this.this$0 = s22Var;
            this.$groupBy = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return new a(this.$section, this.this$0, this.$groupBy, spjVar);
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super MediaBrowserCompat.MediaItem> spjVar) {
            return ((a) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
            CatalogTabStyle catalogTabStyle = this.$section.K;
            CatalogTabStyle.Icon icon = catalogTabStyle instanceof CatalogTabStyle.Icon ? (CatalogTabStyle.Icon) catalogTabStyle : null;
            Bitmap a = mg5.a(6, null, icon != null ? icon.b : null);
            s22 s22Var = this.this$0;
            UIBlockList uIBlockList = this.$section;
            String str = this.$groupBy;
            int i = s22.d;
            s22Var.getClass();
            c22 b = s22.b(uIBlockList);
            s22.a aVar = s22.a.LIST;
            MediaDescriptionCompat.Builder mediaId = new MediaDescriptionCompat.Builder().setMediaId(s22Var.b.a.serialize(b));
            mediaId.setTitle(uIBlockList.z);
            mediaId.setIconBitmap(a);
            Bundle bundle = new Bundle();
            bundle.putInt("android.media.browse.CONTENT_STYLE_BROWSABLE_HINT", aVar.h());
            if (str != null) {
                bundle.putString("android.media.browse.CONTENT_STYLE_GROUP_TITLE_HINT", str);
            }
            return new MediaBrowserCompat.MediaItem(mediaId.setExtras(bundle).build(), 1);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t22(UIBlockCatalog uIBlockCatalog, s22 s22Var, String str, spj<? super t22> spjVar) {
        super(2, spjVar);
        this.$block = uIBlockCatalog;
        this.this$0 = s22Var;
        this.$groupBy = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        t22 t22Var = new t22(this.$block, this.this$0, this.$groupBy, spjVar);
        t22Var.L$0 = obj;
        return t22Var;
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super List<? extends MediaBrowserCompat.MediaItem>> spjVar) {
        return ((t22) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        yvj yvjVar = (yvj) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
            return obj;
        }
        kotlin.a.a(obj);
        ArrayList arrayList = (ArrayList) this.$block.C.getValue();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            if (obj2 instanceof UIBlockList) {
                arrayList2.add(obj2);
            }
        }
        s22 s22Var = this.this$0;
        String str = this.$groupBy;
        ArrayList arrayList3 = new ArrayList(c5g.u(arrayList2, 10));
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            arrayList3.add(myc0.b(yvjVar, null, null, new a((UIBlockList) it.next(), s22Var, str, null), 3));
        }
        this.L$0 = null;
        this.label = 1;
        Object e = fto0.e(arrayList3, this);
        return e == coroutineSingletons ? coroutineSingletons : e;
    }
}
