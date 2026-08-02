package xsna;

import com.vk.music.bottomsheets.MusicBottomSheetLaunchPoint;
import com.vk.music.bottomsheets.reactions.presentation.LoadReactionsStateValue;
import com.vk.music.offline.configs.api.domain.model.ReactionsConfig;

/* compiled from: AudioReactionsViewState.kt */
/* loaded from: classes3.dex */
public final class ku4 implements km50 {
    public final LoadReactionsStateValue b;
    public final ReactionsConfig c;
    public final String d;
    public final MusicBottomSheetLaunchPoint e;

    public ku4(LoadReactionsStateValue loadReactionsStateValue, ReactionsConfig reactionsConfig, String str, MusicBottomSheetLaunchPoint musicBottomSheetLaunchPoint) {
        this.b = loadReactionsStateValue;
        this.c = reactionsConfig;
        this.d = str;
        this.e = musicBottomSheetLaunchPoint;
    }

    public static ku4 a(ku4 ku4Var, LoadReactionsStateValue loadReactionsStateValue, ReactionsConfig reactionsConfig) {
        String str = ku4Var.d;
        MusicBottomSheetLaunchPoint musicBottomSheetLaunchPoint = ku4Var.e;
        ku4Var.getClass();
        return new ku4(loadReactionsStateValue, reactionsConfig, str, musicBottomSheetLaunchPoint);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ku4)) {
            return false;
        }
        ku4 ku4Var = (ku4) obj;
        return this.b == ku4Var.b && epx.f(this.c, ku4Var.c) && epx.f(this.d, ku4Var.d) && epx.f(this.e, ku4Var.e);
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode() * 31;
        ReactionsConfig reactionsConfig = this.c;
        int hashCode2 = (hashCode + (reactionsConfig == null ? 0 : reactionsConfig.hashCode())) * 31;
        String str = this.d;
        return this.e.hashCode() + ((hashCode2 + (str != null ? str.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "AudioReactionsState(loadState=" + this.b + ", reactions=" + this.c + ", selectedId=" + this.d + ", launchPoint=" + this.e + ')';
    }
}
