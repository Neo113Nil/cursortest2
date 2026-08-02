package com.yandex.div.core.state;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Map;
import xsna.zk3;

/* loaded from: classes7.dex */
public class DivViewState {

    @NonNull
    private final Map<String, BlockState> mBlockStates;
    private final long mCurrentDivStateId;

    public interface BlockState {
    }

    public DivViewState(long j) {
        this(j, new zk3());
    }

    @Nullable
    public <T extends BlockState> T getBlockState(@NonNull String str) {
        return (T) this.mBlockStates.get(str);
    }

    @NonNull
    public Map<String, BlockState> getBlockStates() {
        return this.mBlockStates;
    }

    public long getCurrentDivStateId() {
        return this.mCurrentDivStateId;
    }

    public <T extends BlockState> void putBlockState(@NonNull String str, @NonNull T t) {
        this.mBlockStates.put(str, t);
    }

    public void reset() {
        this.mBlockStates.clear();
    }

    public DivViewState(long j, @NonNull Map<String, BlockState> map) {
        this.mCurrentDivStateId = j;
        this.mBlockStates = map;
    }
}
