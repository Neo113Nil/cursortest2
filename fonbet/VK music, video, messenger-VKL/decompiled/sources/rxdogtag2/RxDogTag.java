package rxdogtag2;

import com.huawei.hms.hihealth.data.DeviceInfo;
import io.reactivex.rxjava3.exceptions.OnErrorNotImplementedException;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import xsna.axm0;
import xsna.zr;

/* loaded from: classes11.dex */
public final class RxDogTag {
    public static final String STACK_ELEMENT_SOURCE_DELEGATE = "[[ Originating callback: %s ]]";
    public static final String STACK_ELEMENT_SOURCE_HEADER = "[[ ↑↑ Inferred subscribe point ↑↑ ]]";
    public static final String STACK_ELEMENT_TRACE_HEADER = "[[ ↓↓ Original trace ↓↓ ]]";

    public static final class Builder {
        boolean guardObserverCallbacks = true;
        boolean disableAnnotations = false;
        List<ObserverHandler> observerHandlers = new ArrayList();
        Set<String> ignoredPackages = new LinkedHashSet();
        boolean repackageOnErrorNotImplementedExceptions = true;

        public Builder addIgnoredPackages(String... strArr) {
            return addIgnoredPackages(Arrays.asList(strArr));
        }

        public Builder addObserverHandlers(ObserverHandler... observerHandlerArr) {
            return addObserverHandlers(Arrays.asList(observerHandlerArr));
        }

        public Builder configureWith(Configurer configurer) {
            configurer.apply(this);
            return this;
        }

        public Builder disableAnnotations() {
            this.disableAnnotations = true;
            return this;
        }

        public Builder disableRepackagingOnErrorNotImplementedExceptions() {
            this.repackageOnErrorNotImplementedExceptions = false;
            return this;
        }

        public Builder guardObserverCallbacks(boolean z) {
            this.guardObserverCallbacks = z;
            return this;
        }

        public void install() {
            RxDogTag.installWithBuilder(new Configuration(this));
        }

        public Builder addIgnoredPackages(Collection<String> collection) {
            this.ignoredPackages.addAll(collection);
            return this;
        }

        public Builder addObserverHandlers(Collection<ObserverHandler> collection) {
            this.observerHandlers.addAll(collection);
            return this;
        }
    }

    public static class Configuration {
        final boolean disableAnnotations;
        final boolean guardObserverCallbacks;
        final Set<String> ignoredPackages;
        final List<ObserverHandler> observerHandlers;
        final boolean repackageOnErrorNotImplementedExceptions;
        private static final Collection<String> DEFAULT_IGNORED_PACKAGES = Arrays.asList("io.reactivex.rxjava3", DogTagObserver.class.getPackage().getName());
        private static final ObserverHandler DEFAULT_HANDLER = new ObserverHandler() { // from class: rxdogtag2.RxDogTag.Configuration.1
        };

        public Configuration(Builder builder) {
            this.disableAnnotations = builder.disableAnnotations;
            ArrayList arrayList = new ArrayList(builder.observerHandlers);
            arrayList.add(DEFAULT_HANDLER);
            LinkedHashSet linkedHashSet = new LinkedHashSet(builder.ignoredPackages);
            linkedHashSet.addAll(DEFAULT_IGNORED_PACKAGES);
            this.observerHandlers = Collections.unmodifiableList(arrayList);
            this.ignoredPackages = Collections.unmodifiableSet(linkedHashSet);
            this.repackageOnErrorNotImplementedExceptions = builder.repackageOnErrorNotImplementedExceptions;
            this.guardObserverCallbacks = builder.guardObserverCallbacks;
        }
    }

    /* loaded from: classes9.dex */
    public interface Configurer {
        void apply(Builder builder);
    }

    public interface NonCheckingConsumer<T> {
        void accept(T t);
    }

    /* loaded from: classes9.dex */
    public interface NonCheckingPredicate<T> {
        boolean test(T t);
    }

    private RxDogTag() {
        throw new InstantiationError();
    }

    public static Builder builder() {
        return new Builder();
    }

    private static boolean containsAnyPackages(String str, Set<String> set) {
        Iterator<String> it = set.iterator();
        while (it.hasNext()) {
            if (str.startsWith(it.next())) {
                return true;
            }
        }
        return false;
    }

    public static OnErrorNotImplementedException createException(Configuration configuration, Throwable th, Throwable th2, String str) {
        OnErrorNotImplementedException onErrorNotImplementedException;
        StackTraceElement[] stackTraceElementArr;
        StackTraceElement extractStackElementTag = extractStackElementTag(th, configuration.ignoredPackages);
        if (configuration.repackageOnErrorNotImplementedExceptions && (th2 instanceof OnErrorNotImplementedException)) {
            th2 = th2.getCause();
        }
        if (th2 instanceof OnErrorNotImplementedException) {
            OnErrorNotImplementedException onErrorNotImplementedException2 = (OnErrorNotImplementedException) th2;
            onErrorNotImplementedException = onErrorNotImplementedException2;
            th2 = onErrorNotImplementedException2.getCause();
        } else {
            String message = th2.getMessage();
            if (message == null) {
                message = "";
            }
            onErrorNotImplementedException = new OnErrorNotImplementedException(message, th2);
            onErrorNotImplementedException.setStackTrace(new StackTraceElement[0]);
        }
        StackTraceElement[] stackTrace = th2.getStackTrace();
        char c = 3;
        int i = str != null ? 4 : 3;
        if (configuration.disableAnnotations) {
            stackTraceElementArr = new StackTraceElement[stackTrace.length + 1];
            stackTraceElementArr[0] = extractStackElementTag;
            if (stackTrace.length != 0) {
                System.arraycopy(stackTrace, 0, stackTraceElementArr, 1, stackTrace.length);
            }
        } else {
            int indexOfLast = indexOfLast(stackTrace, new NonCheckingPredicate() { // from class: rxdogtag2.h0
                @Override // rxdogtag2.RxDogTag.NonCheckingPredicate
                public final boolean test(Object obj) {
                    boolean lambda$createException$6;
                    lambda$createException$6 = RxDogTag.lambda$createException$6((StackTraceElement) obj);
                    return lambda$createException$6;
                }
            });
            int i2 = indexOfLast != -1 ? indexOfLast + 1 : 0;
            StackTraceElement[] stackTraceElementArr2 = new StackTraceElement[(stackTrace.length + i) - i2];
            stackTraceElementArr2[0] = extractStackElementTag;
            stackTraceElementArr2[1] = new StackTraceElement(STACK_ELEMENT_SOURCE_HEADER, "", "", 0);
            if (str != null) {
                Locale locale = Locale.US;
                stackTraceElementArr2[2] = new StackTraceElement(zr.a("[[ Originating callback: ", str, " ]]"), "", "", 0);
            } else {
                c = 2;
            }
            stackTraceElementArr2[c] = new StackTraceElement(STACK_ELEMENT_TRACE_HEADER, "", "", 0);
            if (stackTrace.length != 0) {
                System.arraycopy(stackTrace, i2, stackTraceElementArr2, i, stackTrace.length - i2);
            }
            stackTraceElementArr = stackTraceElementArr2;
        }
        th2.setStackTrace(stackTraceElementArr);
        return onErrorNotImplementedException;
    }

    private static StackTraceElement extractStackElementTag(Throwable th, Set<String> set) {
        for (StackTraceElement stackTraceElement : th.getStackTrace()) {
            if (!containsAnyPackages(stackTraceElement.getClassName(), set)) {
                return stackTraceElement;
            }
        }
        return new StackTraceElement(DeviceInfo.STR_TYPE_UNKNOWN, "unknown", "unknown", 0);
    }

    public static void guardedDelegateCall(final NonCheckingConsumer<Throwable> nonCheckingConsumer, Runnable runnable) {
        final Thread.UncaughtExceptionHandler uncaughtExceptionHandler = Thread.currentThread().getUncaughtExceptionHandler();
        try {
            try {
                Thread.currentThread().setUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() { // from class: rxdogtag2.g0
                    @Override // java.lang.Thread.UncaughtExceptionHandler
                    public final void uncaughtException(Thread thread, Throwable th) {
                        RxDogTag.lambda$guardedDelegateCall$5(uncaughtExceptionHandler, nonCheckingConsumer, thread, th);
                    }
                });
                runnable.run();
            } finally {
                Thread.currentThread().setUncaughtExceptionHandler(uncaughtExceptionHandler);
            }
        } catch (OnErrorNotImplementedException e) {
            nonCheckingConsumer.accept(e.getCause());
        } catch (Throwable th) {
            nonCheckingConsumer.accept(th);
        }
    }

    private static <T> int indexOfLast(T[] tArr, NonCheckingPredicate<T> nonCheckingPredicate) {
        for (int length = tArr.length - 1; length >= 0; length--) {
            if (nonCheckingPredicate.test(tArr[length])) {
                return length;
            }
        }
        return -1;
    }

    public static void install() {
        new Builder().install();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static synchronized void installWithBuilder(Configuration configuration) {
        synchronized (RxDogTag.class) {
            io.reactivex.rxjava3.plugins.a.g = new i0(configuration);
            io.reactivex.rxjava3.plugins.a.e = new j0(configuration);
            io.reactivex.rxjava3.plugins.a.h = new k0(configuration);
            io.reactivex.rxjava3.plugins.a.f = new l0(configuration);
            io.reactivex.rxjava3.plugins.a.i = new m0(configuration);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$createException$6(StackTraceElement stackTraceElement) {
        return STACK_ELEMENT_TRACE_HEADER.equals(stackTraceElement.getClassName());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$guardedDelegateCall$5(Thread.UncaughtExceptionHandler uncaughtExceptionHandler, NonCheckingConsumer nonCheckingConsumer, Thread thread, Throwable th) {
        Thread.currentThread().setUncaughtExceptionHandler(uncaughtExceptionHandler);
        if (th instanceof OnErrorNotImplementedException) {
            nonCheckingConsumer.accept(th);
        } else if ((th instanceof NullPointerException) && "subscribeActual failed".equals(th.getMessage())) {
            nonCheckingConsumer.accept(th.getCause());
        } else {
            uncaughtExceptionHandler.uncaughtException(thread, th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ io.reactivex.rxjava3.core.v lambda$installWithBuilder$0(Configuration configuration, io.reactivex.rxjava3.core.q qVar, io.reactivex.rxjava3.core.v vVar) throws Throwable {
        Iterator<ObserverHandler> it = configuration.observerHandlers.iterator();
        while (it.hasNext()) {
            if (shouldDecorate(it.next().handle(qVar, vVar))) {
                return new DogTagObserver(configuration, vVar);
            }
        }
        return vVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ axm0 lambda$installWithBuilder$1(Configuration configuration, io.reactivex.rxjava3.core.g gVar, axm0 axm0Var) throws Throwable {
        Iterator<ObserverHandler> it = configuration.observerHandlers.iterator();
        while (it.hasNext()) {
            if (shouldDecorate(it.next().handle(gVar, axm0Var))) {
                return new DogTagSubscriber(configuration, axm0Var);
            }
        }
        return axm0Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ io.reactivex.rxjava3.core.z lambda$installWithBuilder$2(Configuration configuration, io.reactivex.rxjava3.core.x xVar, io.reactivex.rxjava3.core.z zVar) throws Throwable {
        Iterator<ObserverHandler> it = configuration.observerHandlers.iterator();
        while (it.hasNext()) {
            if (shouldDecorate(it.next().handle(xVar, zVar))) {
                return new DogTagSingleObserver(configuration, zVar);
            }
        }
        return zVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ io.reactivex.rxjava3.core.m lambda$installWithBuilder$3(Configuration configuration, io.reactivex.rxjava3.core.k kVar, io.reactivex.rxjava3.core.m mVar) throws Throwable {
        Iterator<ObserverHandler> it = configuration.observerHandlers.iterator();
        while (it.hasNext()) {
            if (shouldDecorate(it.next().handle(kVar, mVar))) {
                return new DogTagMaybeObserver(configuration, mVar);
            }
        }
        return mVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ io.reactivex.rxjava3.core.c lambda$installWithBuilder$4(Configuration configuration, io.reactivex.rxjava3.core.a aVar, io.reactivex.rxjava3.core.c cVar) throws Throwable {
        Iterator<ObserverHandler> it = configuration.observerHandlers.iterator();
        while (it.hasNext()) {
            if (shouldDecorate(it.next().handle(aVar, cVar))) {
                return new DogTagCompletableObserver(configuration, cVar);
            }
        }
        return cVar;
    }

    public static void reportError(Configuration configuration, Throwable th, Throwable th2, String str) {
        io.reactivex.rxjava3.plugins.a.a(createException(configuration, th, th2, str));
    }

    public static synchronized void reset() {
        synchronized (RxDogTag.class) {
            io.reactivex.rxjava3.plugins.a.e = null;
            io.reactivex.rxjava3.plugins.a.g = null;
            io.reactivex.rxjava3.plugins.a.f = null;
            io.reactivex.rxjava3.plugins.a.h = null;
            io.reactivex.rxjava3.plugins.a.i = null;
        }
    }

    private static boolean shouldDecorate(Object obj) {
        if (obj instanceof RxDogTagErrorReceiver) {
            return true;
        }
        if (obj instanceof io.reactivex.rxjava3.observers.c) {
            return !((io.reactivex.rxjava3.observers.c) obj).hasCustomOnError();
        }
        return false;
    }
}
