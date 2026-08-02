package com.yandex.passport.internal.usecase.ui;

import android.net.Uri;
import com.yandex.passport.common.core.Uid;
import com.yandex.passport.common.logger.LogLevel;
import com.yandex.passport.sloth.data.PicturePushState;
import defpackage.jl40;
import java.util.concurrent.CancellationException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.TimeoutCancellationException;

/* loaded from: classes2.dex */
public final class e0 extends com.yandex.passport.common.domain.d {
    public final com.yandex.passport.internal.network.r b;

    public e0(com.yandex.passport.common.coroutine.a aVar, com.yandex.passport.internal.network.r rVar) {
        super(((com.yandex.passport.common.coroutine.b) aVar).c);
        this.b = rVar;
    }

    @Override // com.yandex.passport.common.domain.d
    public final Object b(Object obj, Continuation continuation) {
        Object failure;
        Uri.Builder appendQueryParameter;
        d0 d0Var = (d0) obj;
        try {
            com.yandex.passport.internal.network.r rVar = this.b;
            Uid uid = d0Var.d;
            String str = d0Var.a;
            PicturePushState picturePushState = d0Var.b;
            Uri a = rVar.a(uid.getValue(), d0Var.c);
            if (picturePushState instanceof PicturePushState.Picture) {
                appendQueryParameter = a.buildUpon().appendQueryParameter("used_tracks", str);
            } else if (jl40.l(picturePushState, PicturePushState.PictureNotMe.INSTANCE)) {
                appendQueryParameter = a.buildUpon().appendQueryParameter("open_popup", "not_me");
            } else if (jl40.l(picturePushState, PicturePushState.PictureAboutDevice.INSTANCE)) {
                appendQueryParameter = a.buildUpon().appendQueryParameter("open_popup", "source_of_entry");
            } else if (jl40.l(picturePushState, PicturePushState.Number.INSTANCE)) {
                appendQueryParameter = a.buildUpon().appendPath("number").appendQueryParameter("used_tracks", str);
            } else {
                if (!(picturePushState instanceof PicturePushState.Success)) {
                    throw new NoWhenBranchMatchedException();
                }
                appendQueryParameter = a.buildUpon().appendPath("selector").appendQueryParameter("selected_picture", String.valueOf(((PicturePushState.Success) picturePushState).getSelectedPicture()));
            }
            Uri build = appendQueryParameter.build();
            com.yandex.passport.common.logger.c cVar = com.yandex.passport.common.logger.a.a;
            if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, null, "picture Uri: " + build, 8);
            }
            com.yandex.passport.common.url.b.Companion.getClass();
            failure = new com.yandex.passport.common.url.b(build.toString());
        } catch (TimeoutCancellationException e) {
            failure = new Result.Failure(e);
        } catch (CancellationException e2) {
            throw e2;
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        return new Result(failure);
    }
}
