package com.yandex.div.core.view2;

import android.graphics.drawable.Drawable;
import com.yandex.div.core.DecodeBase64ImageTask;
import com.yandex.div.core.Div2ImageStubProvider;
import com.yandex.div.core.util.ImageRepresentation;
import com.yandex.div.core.view2.divs.widgets.LoadableImage;
import com.yandex.div.core.view2.errors.ErrorCollector;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import xsna.izs;
import xsna.s3q0;

/* compiled from: DivPlaceholderLoader.kt */
/* loaded from: classes7.dex */
public class DivPlaceholderLoader {
    private final ExecutorService executorService;
    private final Div2ImageStubProvider imageStubProvider;

    public DivPlaceholderLoader(Div2ImageStubProvider div2ImageStubProvider, ExecutorService executorService) {
        this.imageStubProvider = div2ImageStubProvider;
        this.executorService = executorService;
    }

    private Future<?> decodeBase64(String str, boolean z, izs<? super ImageRepresentation, s3q0> izsVar) {
        DecodeBase64ImageTask decodeBase64ImageTask = new DecodeBase64ImageTask(str, z, izsVar);
        if (!z) {
            return this.executorService.submit(decodeBase64ImageTask);
        }
        decodeBase64ImageTask.run();
        return null;
    }

    private void enqueueDecoding(String str, final LoadableImage loadableImage, boolean z, final izs<? super ImageRepresentation, s3q0> izsVar) {
        Future<?> loadingTask = loadableImage.getLoadingTask();
        if (loadingTask != null) {
            loadingTask.cancel(true);
        }
        Future<?> decodeBase64 = decodeBase64(str, z, new izs<ImageRepresentation, s3q0>() { // from class: com.yandex.div.core.view2.DivPlaceholderLoader$enqueueDecoding$future$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // xsna.izs
            public /* bridge */ /* synthetic */ s3q0 invoke(ImageRepresentation imageRepresentation) {
                invoke2(imageRepresentation);
                return s3q0.a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(ImageRepresentation imageRepresentation) {
                izsVar.invoke(imageRepresentation);
                loadableImage.cleanLoadingTask();
            }
        });
        if (decodeBase64 != null) {
            loadableImage.saveLoadingTask(decodeBase64);
        }
    }

    public void applyPlaceholder(LoadableImage loadableImage, final ErrorCollector errorCollector, String str, int i, boolean z, izs<? super Drawable, s3q0> izsVar, final izs<? super ImageRepresentation, s3q0> izsVar2) {
        final DivPlaceholderLoader divPlaceholderLoader;
        final int i2;
        final izs<? super Drawable, s3q0> izsVar3;
        s3q0 s3q0Var;
        if (str != null) {
            divPlaceholderLoader = this;
            i2 = i;
            izsVar3 = izsVar;
            enqueueDecoding(str, loadableImage, z, new izs<ImageRepresentation, s3q0>() { // from class: com.yandex.div.core.view2.DivPlaceholderLoader$applyPlaceholder$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(1);
                }

                @Override // xsna.izs
                public /* bridge */ /* synthetic */ s3q0 invoke(ImageRepresentation imageRepresentation) {
                    invoke2(imageRepresentation);
                    return s3q0.a;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(ImageRepresentation imageRepresentation) {
                    Div2ImageStubProvider div2ImageStubProvider;
                    if (imageRepresentation != null) {
                        izsVar2.invoke(imageRepresentation);
                        return;
                    }
                    ErrorCollector.this.logWarning(new Throwable("Preview doesn't contain base64 image"));
                    izs<Drawable, s3q0> izsVar4 = izsVar3;
                    div2ImageStubProvider = divPlaceholderLoader.imageStubProvider;
                    izsVar4.invoke(div2ImageStubProvider.getImageStubDrawable(i2));
                }
            });
            s3q0Var = s3q0.a;
        } else {
            divPlaceholderLoader = this;
            i2 = i;
            izsVar3 = izsVar;
            s3q0Var = null;
        }
        if (s3q0Var == null) {
            izsVar3.invoke(divPlaceholderLoader.imageStubProvider.getImageStubDrawable(i2));
        }
    }
}
