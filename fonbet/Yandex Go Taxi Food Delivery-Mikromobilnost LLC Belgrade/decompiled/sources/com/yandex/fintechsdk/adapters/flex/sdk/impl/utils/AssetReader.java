package com.yandex.fintechsdk.adapters.flex.sdk.impl.utils;

import android.content.Context;
import defpackage.ooc;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0000\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/yandex/fintechsdk/adapters/flex/sdk/impl/utils/AssetReader;", "", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "readTextAsset", "", "filename", "Companion", "impl-18-1-0_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class AssetReader {

    @Deprecated
    public static final int BUFFER_SIZE = 2048;
    private static final Companion Companion = new Companion(null);
    private final Context context;

    public AssetReader(Context context) {
        this.context = context;
    }

    public final String readTextAsset(String filename) {
        Object failure;
        try {
            char[] cArr = new char[2048];
            InputStream open = this.context.getAssets().open(filename);
            try {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(open));
                StringBuilder sb = new StringBuilder(open.available());
                while (true) {
                    int read = bufferedReader.read(cArr);
                    if (read == -1) {
                        break;
                    }
                    sb.append(cArr, 0, read);
                }
                failure = sb.toString();
                ooc.g(open, null);
            } finally {
            }
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        return (String) (failure instanceof Result.Failure ? null : failure);
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/yandex/fintechsdk/adapters/flex/sdk/impl/utils/AssetReader$Companion;", "", "<init>", "()V", "BUFFER_SIZE", "", "impl-18-1-0_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
