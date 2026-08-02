package com.yandex.div.core.view2.errors;

import com.yandex.div.core.Disposable;
import com.yandex.div.core.view2.errors.ErrorCollector;
import com.yandex.div2.j3;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.collections.EmptyList;
import xsna.s3q0;
import xsna.wzs;

/* compiled from: ErrorCollector.kt */
/* loaded from: classes7.dex */
public class ErrorCollector {
    private final Set<wzs<List<? extends Throwable>, List<? extends Throwable>, s3q0>> observers = new LinkedHashSet();
    private final List<Throwable> runtimeErrors = new ArrayList();
    private List<? extends Throwable> parsingErrors = EmptyList.b;
    private List<Throwable> warnings = new ArrayList();
    private List<Throwable> errors = new ArrayList();
    private boolean errorsAreValid = true;

    private void notifyObservers() {
        this.errorsAreValid = false;
        if (this.observers.isEmpty()) {
            return;
        }
        rebuildErrors();
        Iterator<T> it = this.observers.iterator();
        while (it.hasNext()) {
            ((wzs) it.next()).invoke(this.errors, this.warnings);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void observeAndGet$lambda$1(ErrorCollector errorCollector, wzs wzsVar) {
        errorCollector.observers.remove(wzsVar);
    }

    private void rebuildErrors() {
        if (this.errorsAreValid) {
            return;
        }
        this.errors.clear();
        this.errors.addAll(this.parsingErrors);
        this.errors.addAll(this.runtimeErrors);
        this.errorsAreValid = true;
    }

    public void attachParsingErrors(j3 j3Var) {
        List<? extends Throwable> list;
        if (j3Var == null || (list = j3Var.h) == null) {
            list = EmptyList.b;
        }
        this.parsingErrors = list;
        notifyObservers();
    }

    public void cleanRuntimeWarningsAndErrors() {
        this.warnings.clear();
        this.runtimeErrors.clear();
        notifyObservers();
    }

    public Iterator<Throwable> getWarnings() {
        return this.warnings.listIterator();
    }

    public void logError(Throwable th) {
        this.runtimeErrors.add(th);
        notifyObservers();
    }

    public void logWarning(Throwable th) {
        this.warnings.add(th);
        notifyObservers();
    }

    public Disposable observeAndGet(final wzs<? super List<? extends Throwable>, ? super List<? extends Throwable>, s3q0> wzsVar) {
        this.observers.add(wzsVar);
        rebuildErrors();
        wzsVar.invoke(this.errors, this.warnings);
        return new Disposable() { // from class: xsna.zup
            @Override // com.yandex.div.core.Disposable, java.lang.AutoCloseable, java.io.Closeable
            public final void close() {
                ErrorCollector.observeAndGet$lambda$1(ErrorCollector.this, wzsVar);
            }
        };
    }
}
