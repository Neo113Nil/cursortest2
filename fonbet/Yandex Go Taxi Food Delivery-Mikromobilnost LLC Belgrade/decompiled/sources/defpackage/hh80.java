package defpackage;

import com.yandex.go.places.organization.card.impl.domain.entities.card.OrganizationCardPageLoadingState;

/* loaded from: classes13.dex */
public abstract /* synthetic */ class hh80 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[OrganizationCardPageLoadingState.values().length];
        try {
            iArr[OrganizationCardPageLoadingState.LOADING.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[OrganizationCardPageLoadingState.CONTENT_LOADED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[OrganizationCardPageLoadingState.FAILED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
