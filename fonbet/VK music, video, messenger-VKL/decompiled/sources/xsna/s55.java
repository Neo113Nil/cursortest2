package xsna;

import com.vk.log.L;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.ok.android.utils.Logger;

/* compiled from: AuthManager.kt */
/* loaded from: classes4.dex */
public final /* synthetic */ class s55 extends FunctionReferenceImpl implements izs {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s55(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, obj, cls, str, str2, i2);
        this.b = i3;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    @Override // xsna.izs
    public final java.lang.Object invoke(java.lang.Object r31) {
        /*
            Method dump skipped, instructions count: 1346
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: xsna.s55.invoke(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s55(Object obj, int i) {
        super(1, obj, shm.class, "onRequestByCacheError", "onRequestByCacheError(Ljava/lang/Throwable;)V", 0);
        this.b = i;
        switch (i) {
            case 6:
                super(1, obj, uuo.class, "mapEasterEggsResponseToDomain", "mapEasterEggsResponseToDomain(Lcom/vk/api/generated/specials/dto/SpecialsGetEasterEggsResponseDto;)Ljava/util/List;", 0);
                break;
            case 7:
            case 8:
            case 9:
            case 10:
            case 15:
            default:
                break;
            case 11:
                super(1, obj, dv60.class, "startTask", "startTask(Lcom/vk/mvi/MviTask;)V", 0);
                break;
            case 12:
                super(1, obj, tga.class, "map", "map(Lcom/vk/catalog/mvi/section/ui/entity/CatalogSectionState;)Lcom/vk/catalog/mvi/section/ui/entity/CatalogSectionViewState;", 0);
                break;
            case 13:
                super(1, obj, vpc0.class, "mapPlaces", "mapPlaces-m4snZxA(Lcom/vk/newsfeed/posting/impl/domain/model/PostingState;)Ljava/util/List;", 0);
                break;
            case 14:
                super(1, obj, L.class, Logger.METHOD_E, "e(Ljava/lang/Throwable;)V", 0);
                break;
            case 16:
                super(1, obj, dhr0.class, "getDrawable", "getDrawable(I)Landroid/graphics/drawable/Drawable;", 0);
                break;
        }
    }
}
