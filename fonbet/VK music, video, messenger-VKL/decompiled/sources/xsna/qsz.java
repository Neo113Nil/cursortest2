package xsna;

import xsna.frz;

/* compiled from: LoaderUpdater.kt */
/* loaded from: classes3.dex */
public interface qsz<Data extends frz, Update> {
    io.reactivex.rxjava3.core.q<Update> a();

    Data b(Data data, Update update, drz<Data> drzVar, boolean z);
}
