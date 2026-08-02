package com.ybsdk.core.design.theme;

import android.content.Context;
import android.os.Parcelable;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J\u0017\u0010\b\u001a\u0004\u0018\u00018\u00002\u0006\u0010\t\u001a\u00020\nH\u0016¢\u0006\u0002\u0010\u000bR\u0014\u0010\u0003\u001a\u0004\u0018\u00018\u0000X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u0004\u0018\u00018\u0000X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0005¨\u0006\f"}, d2 = {"Lcom/ybsdk/core/design/theme/ThemedParams;", "T", "Landroid/os/Parcelable;", "light", "getLight", "()Ljava/lang/Object;", "dark", "getDark", "get", "context", "Landroid/content/Context;", "(Landroid/content/Context;)Ljava/lang/Object;", "core-design_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface ThemedParams<T> extends Parcelable {
    T get(Context context);

    T getDark();

    T getLight();
}
