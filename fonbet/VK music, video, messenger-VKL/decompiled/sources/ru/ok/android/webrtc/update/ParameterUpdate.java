package ru.ok.android.webrtc.update;

/* loaded from: classes9.dex */
public interface ParameterUpdate<T> {
    public static final Companion Companion = Companion.a;

    public static final class Companion {
        public static final /* synthetic */ Companion a = new Companion();

        public final <T> NewValue<T> newValue(T t) {
            return new NewValue<>(t);
        }

        public final <T> NoUpdates<T> noUpdates() {
            return new NoUpdates<>();
        }
    }

    public static final class NewValue<T> implements ParameterUpdate<T> {
        public final Object a;

        public NewValue(T t) {
            this.a = t;
        }

        public final T getValue() {
            return (T) this.a;
        }

        @Override // ru.ok.android.webrtc.update.ParameterUpdate
        public T getValueOrNull() {
            return (T) this.a;
        }

        @Override // ru.ok.android.webrtc.update.ParameterUpdate
        public boolean hasUpdate() {
            return true;
        }

        @Override // ru.ok.android.webrtc.update.ParameterUpdate
        public T requireValue() {
            return (T) this.a;
        }
    }

    public static final class NoUpdates<T> implements ParameterUpdate<T> {
        @Override // ru.ok.android.webrtc.update.ParameterUpdate
        public T getValueOrNull() {
            return null;
        }

        @Override // ru.ok.android.webrtc.update.ParameterUpdate
        public boolean hasUpdate() {
            return false;
        }

        @Override // ru.ok.android.webrtc.update.ParameterUpdate
        public T requireValue() {
            throw new RuntimeException("No update");
        }
    }

    T getValueOrNull();

    boolean hasUpdate();

    T requireValue();
}
