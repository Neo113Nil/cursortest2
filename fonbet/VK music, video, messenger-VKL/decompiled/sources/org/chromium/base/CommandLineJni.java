package org.chromium.base;

import internal.J.N;
import java.util.List;
import java.util.Map;
import org.chromium.base.CommandLine;
import xsna.dyx;

/* loaded from: classes11.dex */
class CommandLineJni implements CommandLine.Natives {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static dyx sOverride;

    public static CommandLine.Natives get() {
        Object obj;
        dyx dyxVar = sOverride;
        return (dyxVar == null || (obj = dyxVar.a) == null) ? new CommandLineJni() : (CommandLine.Natives) obj;
    }

    public static void setInstanceForTesting(CommandLine.Natives natives) {
        if (sOverride == null) {
            sOverride = dyx.a();
        }
        sOverride.a = natives;
    }

    @Override // org.chromium.base.CommandLine.Natives
    public void appendSwitchWithValue(String str, String str2) {
        N.MUoYiNbY(str, str2);
    }

    @Override // org.chromium.base.CommandLine.Natives
    public void appendSwitchesAndArguments(String[] strArr) {
        N.MPquHBNa(strArr);
    }

    @Override // org.chromium.base.CommandLine.Natives
    public String getSwitchValue(String str) {
        return (String) N.MZJ2lrZY(str);
    }

    @Override // org.chromium.base.CommandLine.Natives
    public Map getSwitches() {
        return (Map) N.MEf0C$KO();
    }

    @Override // org.chromium.base.CommandLine.Natives
    public boolean hasSwitch(String str) {
        return N.MsCvypjU(str);
    }

    @Override // org.chromium.base.CommandLine.Natives
    public void init(List list) {
        N.MDkrKi31(list);
    }

    @Override // org.chromium.base.CommandLine.Natives
    public void removeSwitch(String str) {
        N.M1cMYXGO(str);
    }
}
