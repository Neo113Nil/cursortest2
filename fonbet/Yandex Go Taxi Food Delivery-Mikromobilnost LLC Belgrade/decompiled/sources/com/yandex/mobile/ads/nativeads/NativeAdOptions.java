package com.yandex.mobile.ads.nativeads;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0013\b\u0000\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0007\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/yandex/mobile/ads/nativeads/NativeAdOptions;", "", "", "shouldLoadImagesAutomatically", "<init>", "(Z)V", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "a", "Z", "getShouldLoadImagesAutomatically", "()Z", "mobileads_internalRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class NativeAdOptions {

    /* renamed from: a, reason: from kotlin metadata */
    private final boolean shouldLoadImagesAutomatically;

    public /* synthetic */ NativeAdOptions(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? true : z);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return other != null && NativeAdOptions.class.equals(other.getClass()) && this.shouldLoadImagesAutomatically == ((NativeAdOptions) other).shouldLoadImagesAutomatically;
    }

    public final boolean getShouldLoadImagesAutomatically() {
        return this.shouldLoadImagesAutomatically;
    }

    public int hashCode() {
        return Boolean.hashCode(this.shouldLoadImagesAutomatically);
    }

    public NativeAdOptions(boolean z) {
        this.shouldLoadImagesAutomatically = z;
    }

    public NativeAdOptions() {
        this(false, 1, null);
    }
}
