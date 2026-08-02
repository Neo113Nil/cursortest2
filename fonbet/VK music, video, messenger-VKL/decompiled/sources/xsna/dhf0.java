package xsna;

import android.annotation.SuppressLint;
import android.health.connect.datatypes.ActiveCaloriesBurnedRecord;
import android.health.connect.datatypes.ActivityIntensityRecord;
import android.health.connect.datatypes.BasalBodyTemperatureRecord;
import android.health.connect.datatypes.BasalMetabolicRateRecord;
import android.health.connect.datatypes.BloodGlucoseRecord;
import android.health.connect.datatypes.BloodPressureRecord;
import android.health.connect.datatypes.BodyFatRecord;
import android.health.connect.datatypes.BodyTemperatureRecord;
import android.health.connect.datatypes.BodyWaterMassRecord;
import android.health.connect.datatypes.BoneMassRecord;
import android.health.connect.datatypes.CervicalMucusRecord;
import android.health.connect.datatypes.CyclingPedalingCadenceRecord;
import android.health.connect.datatypes.DistanceRecord;
import android.health.connect.datatypes.ElevationGainedRecord;
import android.health.connect.datatypes.ExerciseCompletionGoal;
import android.health.connect.datatypes.ExerciseLap;
import android.health.connect.datatypes.ExercisePerformanceGoal;
import android.health.connect.datatypes.ExerciseRoute;
import android.health.connect.datatypes.ExerciseSegment;
import android.health.connect.datatypes.ExerciseSessionRecord;
import android.health.connect.datatypes.FloorsClimbedRecord;
import android.health.connect.datatypes.HeartRateRecord;
import android.health.connect.datatypes.HeartRateVariabilityRmssdRecord;
import android.health.connect.datatypes.HeightRecord;
import android.health.connect.datatypes.HydrationRecord;
import android.health.connect.datatypes.IntermenstrualBleedingRecord;
import android.health.connect.datatypes.LeanBodyMassRecord;
import android.health.connect.datatypes.MenstruationFlowRecord;
import android.health.connect.datatypes.MenstruationPeriodRecord;
import android.health.connect.datatypes.Metadata;
import android.health.connect.datatypes.MindfulnessSessionRecord;
import android.health.connect.datatypes.NutritionRecord;
import android.health.connect.datatypes.OvulationTestRecord;
import android.health.connect.datatypes.OxygenSaturationRecord;
import android.health.connect.datatypes.PlannedExerciseBlock;
import android.health.connect.datatypes.PlannedExerciseSessionRecord;
import android.health.connect.datatypes.PlannedExerciseStep;
import android.health.connect.datatypes.PowerRecord;
import android.health.connect.datatypes.RespiratoryRateRecord;
import android.health.connect.datatypes.RestingHeartRateRecord;
import android.health.connect.datatypes.SexualActivityRecord;
import android.health.connect.datatypes.SkinTemperatureRecord;
import android.health.connect.datatypes.SleepSessionRecord;
import android.health.connect.datatypes.SpeedRecord;
import android.health.connect.datatypes.StepsCadenceRecord;
import android.health.connect.datatypes.StepsRecord;
import android.health.connect.datatypes.TotalCaloriesBurnedRecord;
import android.health.connect.datatypes.Vo2MaxRecord;
import android.health.connect.datatypes.WeightRecord;
import android.health.connect.datatypes.WheelchairPushesRecord;
import android.health.connect.datatypes.units.BloodGlucose;
import android.health.connect.datatypes.units.Energy;
import android.health.connect.datatypes.units.Mass;
import android.health.connect.datatypes.units.Percentage;
import android.health.connect.datatypes.units.Power;
import android.health.connect.datatypes.units.Pressure;
import android.health.connect.datatypes.units.Temperature;
import android.health.connect.datatypes.units.TemperatureDelta;
import android.health.connect.datatypes.units.Velocity;
import android.health.connect.datatypes.units.Volume;
import java.time.Duration;
import java.time.Instant;
import java.time.ZoneOffset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.dqk;
import xsna.f4q;
import xsna.fzj0;
import xsna.gkk0;
import xsna.h4q;
import xsna.i4q;
import xsna.k1v;
import xsna.k4q;
import xsna.r0l0;
import xsna.uzj0;
import xsna.vwc0;

/* compiled from: RecordConverters.kt */
/* loaded from: classes12.dex */
public final class dhf0 {
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.Map] */
    public static final NutritionRecord a(yn70 yn70Var) {
        NutritionRecord.Builder mealType;
        NutritionRecord build;
        Mass fromGrams;
        Mass fromGrams2;
        Mass fromGrams3;
        Mass fromGrams4;
        Mass fromGrams5;
        Mass fromGrams6;
        Mass fromGrams7;
        Mass fromGrams8;
        Mass fromGrams9;
        Mass fromGrams10;
        Mass fromGrams11;
        Mass fromGrams12;
        Mass fromGrams13;
        Mass fromGrams14;
        Mass fromGrams15;
        Mass fromGrams16;
        Mass fromGrams17;
        Mass fromGrams18;
        Mass fromGrams19;
        Mass fromGrams20;
        Mass fromGrams21;
        Mass fromGrams22;
        Mass fromGrams23;
        Mass fromGrams24;
        Mass fromGrams25;
        Mass fromGrams26;
        Mass fromGrams27;
        Mass fromGrams28;
        Mass fromGrams29;
        Mass fromGrams30;
        Mass fromGrams31;
        Mass fromGrams32;
        Energy fromCalories;
        Energy fromCalories2;
        Mass fromGrams33;
        Mass fromGrams34;
        Mass fromGrams35;
        Mass fromGrams36;
        Mass fromGrams37;
        Mass fromGrams38;
        Mass fromGrams39;
        Mass fromGrams40;
        j81.i();
        NutritionRecord.Builder d = i81.d(mi20.a(yn70Var.e), yn70Var.a, yn70Var.c);
        Integer num = (Integer) v8x.g.get(Integer.valueOf(yn70Var.W));
        mealType = d.setMealType(num != null ? num.intValue() : 0);
        ZoneOffset zoneOffset = yn70Var.b;
        if (zoneOffset != null) {
            mealType.setStartZoneOffset(zoneOffset);
        }
        ZoneOffset zoneOffset2 = yn70Var.d;
        if (zoneOffset2 != null) {
            mealType.setEndZoneOffset(zoneOffset2);
        }
        vi10 vi10Var = yn70Var.f;
        if (vi10Var != null) {
            fromGrams40 = Mass.fromGrams(vi10Var.a());
            mealType.setBiotin(fromGrams40);
        }
        vi10 vi10Var2 = yn70Var.g;
        if (vi10Var2 != null) {
            fromGrams39 = Mass.fromGrams(vi10Var2.a());
            mealType.setCaffeine(fromGrams39);
        }
        vi10 vi10Var3 = yn70Var.h;
        if (vi10Var3 != null) {
            fromGrams38 = Mass.fromGrams(vi10Var3.a());
            mealType.setCalcium(fromGrams38);
        }
        vi10 vi10Var4 = yn70Var.k;
        if (vi10Var4 != null) {
            fromGrams37 = Mass.fromGrams(vi10Var4.a());
            mealType.setChloride(fromGrams37);
        }
        vi10 vi10Var5 = yn70Var.l;
        if (vi10Var5 != null) {
            fromGrams36 = Mass.fromGrams(vi10Var5.a());
            mealType.setCholesterol(fromGrams36);
        }
        vi10 vi10Var6 = yn70Var.m;
        if (vi10Var6 != null) {
            fromGrams35 = Mass.fromGrams(vi10Var6.a());
            mealType.setChromium(fromGrams35);
        }
        vi10 vi10Var7 = yn70Var.n;
        if (vi10Var7 != null) {
            fromGrams34 = Mass.fromGrams(vi10Var7.a());
            mealType.setCopper(fromGrams34);
        }
        vi10 vi10Var8 = yn70Var.o;
        if (vi10Var8 != null) {
            fromGrams33 = Mass.fromGrams(vi10Var8.a());
            mealType.setDietaryFiber(fromGrams33);
        }
        jlp jlpVar = yn70Var.i;
        if (jlpVar != null) {
            fromCalories2 = Energy.fromCalories(jlpVar.a());
            mealType.setEnergy(fromCalories2);
        }
        jlp jlpVar2 = yn70Var.j;
        if (jlpVar2 != null) {
            fromCalories = Energy.fromCalories(jlpVar2.a());
            mealType.setEnergyFromFat(fromCalories);
        }
        vi10 vi10Var9 = yn70Var.p;
        if (vi10Var9 != null) {
            fromGrams32 = Mass.fromGrams(vi10Var9.a());
            mealType.setFolate(fromGrams32);
        }
        vi10 vi10Var10 = yn70Var.q;
        if (vi10Var10 != null) {
            fromGrams31 = Mass.fromGrams(vi10Var10.a());
            mealType.setFolicAcid(fromGrams31);
        }
        vi10 vi10Var11 = yn70Var.r;
        if (vi10Var11 != null) {
            fromGrams30 = Mass.fromGrams(vi10Var11.a());
            mealType.setIodine(fromGrams30);
        }
        vi10 vi10Var12 = yn70Var.s;
        if (vi10Var12 != null) {
            fromGrams29 = Mass.fromGrams(vi10Var12.a());
            mealType.setIron(fromGrams29);
        }
        vi10 vi10Var13 = yn70Var.t;
        if (vi10Var13 != null) {
            fromGrams28 = Mass.fromGrams(vi10Var13.a());
            mealType.setMagnesium(fromGrams28);
        }
        vi10 vi10Var14 = yn70Var.u;
        if (vi10Var14 != null) {
            fromGrams27 = Mass.fromGrams(vi10Var14.a());
            mealType.setManganese(fromGrams27);
        }
        vi10 vi10Var15 = yn70Var.v;
        if (vi10Var15 != null) {
            fromGrams26 = Mass.fromGrams(vi10Var15.a());
            mealType.setMolybdenum(fromGrams26);
        }
        vi10 vi10Var16 = yn70Var.w;
        if (vi10Var16 != null) {
            fromGrams25 = Mass.fromGrams(vi10Var16.a());
            mealType.setMonounsaturatedFat(fromGrams25);
        }
        String str = yn70Var.V;
        if (str != null) {
            mealType.setMealName(str);
        }
        vi10 vi10Var17 = yn70Var.x;
        if (vi10Var17 != null) {
            fromGrams24 = Mass.fromGrams(vi10Var17.a());
            mealType.setNiacin(fromGrams24);
        }
        vi10 vi10Var18 = yn70Var.y;
        if (vi10Var18 != null) {
            fromGrams23 = Mass.fromGrams(vi10Var18.a());
            mealType.setPantothenicAcid(fromGrams23);
        }
        vi10 vi10Var19 = yn70Var.z;
        if (vi10Var19 != null) {
            fromGrams22 = Mass.fromGrams(vi10Var19.a());
            mealType.setPhosphorus(fromGrams22);
        }
        vi10 vi10Var20 = yn70Var.A;
        if (vi10Var20 != null) {
            fromGrams21 = Mass.fromGrams(vi10Var20.a());
            mealType.setPolyunsaturatedFat(fromGrams21);
        }
        vi10 vi10Var21 = yn70Var.B;
        if (vi10Var21 != null) {
            fromGrams20 = Mass.fromGrams(vi10Var21.a());
            mealType.setPotassium(fromGrams20);
        }
        vi10 vi10Var22 = yn70Var.C;
        if (vi10Var22 != null) {
            fromGrams19 = Mass.fromGrams(vi10Var22.a());
            mealType.setProtein(fromGrams19);
        }
        vi10 vi10Var23 = yn70Var.D;
        if (vi10Var23 != null) {
            fromGrams18 = Mass.fromGrams(vi10Var23.a());
            mealType.setRiboflavin(fromGrams18);
        }
        vi10 vi10Var24 = yn70Var.E;
        if (vi10Var24 != null) {
            fromGrams17 = Mass.fromGrams(vi10Var24.a());
            mealType.setSaturatedFat(fromGrams17);
        }
        vi10 vi10Var25 = yn70Var.F;
        if (vi10Var25 != null) {
            fromGrams16 = Mass.fromGrams(vi10Var25.a());
            mealType.setSelenium(fromGrams16);
        }
        vi10 vi10Var26 = yn70Var.G;
        if (vi10Var26 != null) {
            fromGrams15 = Mass.fromGrams(vi10Var26.a());
            mealType.setSodium(fromGrams15);
        }
        vi10 vi10Var27 = yn70Var.H;
        if (vi10Var27 != null) {
            fromGrams14 = Mass.fromGrams(vi10Var27.a());
            mealType.setSugar(fromGrams14);
        }
        vi10 vi10Var28 = yn70Var.I;
        if (vi10Var28 != null) {
            fromGrams13 = Mass.fromGrams(vi10Var28.a());
            mealType.setThiamin(fromGrams13);
        }
        vi10 vi10Var29 = yn70Var.J;
        if (vi10Var29 != null) {
            fromGrams12 = Mass.fromGrams(vi10Var29.a());
            mealType.setTotalCarbohydrate(fromGrams12);
        }
        vi10 vi10Var30 = yn70Var.K;
        if (vi10Var30 != null) {
            fromGrams11 = Mass.fromGrams(vi10Var30.a());
            mealType.setTotalFat(fromGrams11);
        }
        vi10 vi10Var31 = yn70Var.L;
        if (vi10Var31 != null) {
            fromGrams10 = Mass.fromGrams(vi10Var31.a());
            mealType.setTransFat(fromGrams10);
        }
        vi10 vi10Var32 = yn70Var.M;
        if (vi10Var32 != null) {
            fromGrams9 = Mass.fromGrams(vi10Var32.a());
            mealType.setUnsaturatedFat(fromGrams9);
        }
        vi10 vi10Var33 = yn70Var.N;
        if (vi10Var33 != null) {
            fromGrams8 = Mass.fromGrams(vi10Var33.a());
            mealType.setVitaminA(fromGrams8);
        }
        vi10 vi10Var34 = yn70Var.P;
        if (vi10Var34 != null) {
            fromGrams7 = Mass.fromGrams(vi10Var34.a());
            mealType.setVitaminB6(fromGrams7);
        }
        vi10 vi10Var35 = yn70Var.O;
        if (vi10Var35 != null) {
            fromGrams6 = Mass.fromGrams(vi10Var35.a());
            mealType.setVitaminB12(fromGrams6);
        }
        vi10 vi10Var36 = yn70Var.Q;
        if (vi10Var36 != null) {
            fromGrams5 = Mass.fromGrams(vi10Var36.a());
            mealType.setVitaminC(fromGrams5);
        }
        vi10 vi10Var37 = yn70Var.R;
        if (vi10Var37 != null) {
            fromGrams4 = Mass.fromGrams(vi10Var37.a());
            mealType.setVitaminD(fromGrams4);
        }
        vi10 vi10Var38 = yn70Var.S;
        if (vi10Var38 != null) {
            fromGrams3 = Mass.fromGrams(vi10Var38.a());
            mealType.setVitaminE(fromGrams3);
        }
        vi10 vi10Var39 = yn70Var.T;
        if (vi10Var39 != null) {
            fromGrams2 = Mass.fromGrams(vi10Var39.a());
            mealType.setVitaminK(fromGrams2);
        }
        vi10 vi10Var40 = yn70Var.U;
        if (vi10Var40 != null) {
            fromGrams = Mass.fromGrams(vi10Var40.a());
            mealType.setZinc(fromGrams);
        }
        build = mealType.build();
        return build;
    }

    /* JADX WARN: Type inference failed for: r11v1, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r3v52, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r3v53, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r3v55, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r3v56, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r3v57, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v109, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r5v11, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r5v12, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r5v25, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r5v31, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r5v35, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r5v9, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r6v33, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r7v18, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r9v2, types: [java.lang.Object, java.util.Map] */
    @SuppressLint({"NewApi"})
    public static final void b(zef0 zef0Var) {
        ActivityIntensityRecord build;
        MindfulnessSessionRecord build2;
        Velocity fromMetersPerSecond;
        Power fromWatts;
        Percentage fromValue;
        Volume fromLiters;
        int intValue;
        Temperature fromCelsius;
        Percentage fromValue2;
        Pressure fromMillimetersOfMercury;
        Pressure fromMillimetersOfMercury2;
        Power fromWatts2;
        Temperature fromCelsius2;
        Energy fromCalories;
        Temperature fromCelsius3;
        ExerciseCompletionGoal.DistanceGoal distanceGoal;
        Iterator it;
        ExercisePerformanceGoal.PowerGoal powerGoal;
        Velocity fromMetersPerSecond2;
        Velocity fromMetersPerSecond3;
        Power fromWatts3;
        Power fromWatts4;
        PlannedExerciseSessionRecord plannedExerciseSessionRecord = null;
        if (v3r0.c() && (zef0Var instanceof r90)) {
            r90 r90Var = (r90) zef0Var;
            yff0.a();
            Metadata a = mi20.a(r90Var.e);
            Instant instant = r90Var.a;
            Instant instant2 = r90Var.c;
            Integer num = (Integer) v8x.I.get(Integer.valueOf(r90Var.f));
            ActivityIntensityRecord.Builder b = uu5.b(a, instant, instant2, num != null ? num.intValue() : 0);
            ZoneOffset zoneOffset = r90Var.b;
            if (zoneOffset != null) {
                b.setStartZoneOffset(zoneOffset);
            }
            ZoneOffset zoneOffset2 = r90Var.d;
            if (zoneOffset2 != null) {
                b.setEndZoneOffset(zoneOffset2);
            }
            build = b.build();
        } else {
            build = null;
        }
        if (build == null) {
            if (v3r0.b() && (zef0Var instanceof mo20)) {
                mo20 mo20Var = (mo20) zef0Var;
                xff0.a();
                Metadata a2 = mi20.a(mo20Var.e);
                Instant instant3 = mo20Var.a;
                Instant instant4 = mo20Var.c;
                Integer num2 = (Integer) v8x.J.get(Integer.valueOf(mo20Var.f));
                MindfulnessSessionRecord.Builder a3 = wff0.a(a2, instant3, instant4, num2 != null ? num2.intValue() : 0);
                ZoneOffset zoneOffset3 = mo20Var.b;
                if (zoneOffset3 != null) {
                    a3.setStartZoneOffset(zoneOffset3);
                }
                ZoneOffset zoneOffset4 = mo20Var.d;
                if (zoneOffset4 != null) {
                    a3.setEndZoneOffset(zoneOffset4);
                }
                String str = mo20Var.g;
                if (str != null) {
                    a3.setTitle(str);
                }
                String str2 = mo20Var.h;
                if (str2 != null) {
                    a3.setNotes(str2);
                }
                build2 = a3.build();
            } else {
                build2 = null;
            }
            if (build2 == null) {
                int i = 10;
                if (v3r0.a()) {
                    if (zef0Var instanceof cta0) {
                        cta0 cta0Var = (cta0) zef0Var;
                        boolean z = cta0Var.f;
                        ZoneOffset zoneOffset5 = cta0Var.b;
                        Instant instant5 = cta0Var.c;
                        int i2 = cta0Var.g;
                        hi20 hi20Var = cta0Var.e;
                        Instant instant6 = cta0Var.a;
                        PlannedExerciseSessionRecord.Builder builder = z ? new PlannedExerciseSessionRecord.Builder(mi20.a(hi20Var), v8x.b(i2), instant6, instant5) : new PlannedExerciseSessionRecord.Builder(mi20.a(hi20Var), v8x.b(i2), instant6.atZone(zoneOffset5).toLocalDate(), Duration.between(instant6, instant5));
                        if (zoneOffset5 != null) {
                            builder.setStartZoneOffset(zoneOffset5);
                        }
                        ZoneOffset zoneOffset6 = cta0Var.d;
                        if (zoneOffset6 != null) {
                            builder.setEndZoneOffset(zoneOffset6);
                        }
                        String str3 = cta0Var.j;
                        if (str3 != null) {
                            builder.setTitle(str3);
                        }
                        String str4 = cta0Var.k;
                        if (str4 != null) {
                            builder.setNotes(str4);
                        }
                        ArrayList<bta0> arrayList = cta0Var.i;
                        ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
                        for (bta0 bta0Var : arrayList) {
                            PlannedExerciseBlock.Builder builder2 = new PlannedExerciseBlock.Builder(bta0Var.a);
                            builder2.setDescription(bta0Var.c);
                            ArrayList arrayList3 = bta0Var.b;
                            ArrayList arrayList4 = new ArrayList(c5g.u(arrayList3, i));
                            Iterator it2 = arrayList3.iterator();
                            while (it2.hasNext()) {
                                dta0 dta0Var = (dta0) it2.next();
                                Integer num3 = (Integer) v8x.G.get(Integer.valueOf(dta0Var.a));
                                int intValue2 = num3 != null ? num3.intValue() : 0;
                                Integer num4 = (Integer) v8x.y.get(Integer.valueOf(dta0Var.b));
                                int intValue3 = num4 != null ? num4.intValue() : 0;
                                f4q f4qVar = dta0Var.c;
                                if (f4qVar instanceof f4q.c) {
                                    distanceGoal = new ExerciseCompletionGoal.DistanceGoal(u3q0.c(((f4q.c) f4qVar).a));
                                } else if (f4qVar instanceof f4q.b) {
                                    f4q.b bVar = (f4q.b) f4qVar;
                                    distanceGoal = new ExerciseCompletionGoal.DistanceWithVariableRestGoal(u3q0.c(bVar.a), bVar.b);
                                } else if (f4qVar instanceof f4q.g) {
                                    distanceGoal = new ExerciseCompletionGoal.StepsGoal(((f4q.g) f4qVar).a);
                                } else if (f4qVar instanceof f4q.d) {
                                    distanceGoal = new ExerciseCompletionGoal.DurationGoal(((f4q.d) f4qVar).a);
                                } else if (f4qVar instanceof f4q.f) {
                                    distanceGoal = new ExerciseCompletionGoal.RepetitionsGoal(((f4q.f) f4qVar).a);
                                } else if (f4qVar instanceof f4q.h) {
                                    distanceGoal = new ExerciseCompletionGoal.TotalCaloriesBurnedGoal(u3q0.b(((f4q.h) f4qVar).a));
                                } else if (f4qVar instanceof f4q.a) {
                                    distanceGoal = new ExerciseCompletionGoal.ActiveCaloriesBurnedGoal(u3q0.b(((f4q.a) f4qVar).a));
                                } else if (f4qVar instanceof f4q.i) {
                                    distanceGoal = ExerciseCompletionGoal.UnknownGoal.INSTANCE;
                                } else {
                                    if (!(f4qVar instanceof f4q.e)) {
                                        throw new IllegalArgumentException("Unsupported exercise completion goal " + f4qVar);
                                    }
                                    distanceGoal = ExerciseCompletionGoal.UnspecifiedGoal.INSTANCE;
                                }
                                PlannedExerciseStep.Builder builder3 = new PlannedExerciseStep.Builder(intValue2, intValue3, distanceGoal);
                                builder3.setDescription(dta0Var.e);
                                ArrayList<h4q> arrayList5 = dta0Var.d;
                                ArrayList arrayList6 = new ArrayList(c5g.u(arrayList5, i));
                                for (h4q h4qVar : arrayList5) {
                                    if (h4qVar instanceof h4q.d) {
                                        h4q.d dVar = (h4q.d) h4qVar;
                                        fromWatts3 = Power.fromWatts(dVar.a.a());
                                        fromWatts4 = Power.fromWatts(dVar.b.a());
                                        powerGoal = new ExercisePerformanceGoal.PowerGoal(fromWatts3, fromWatts4);
                                    } else if (h4qVar instanceof h4q.f) {
                                        h4q.f fVar = (h4q.f) h4qVar;
                                        fromMetersPerSecond2 = Velocity.fromMetersPerSecond(fVar.a.a());
                                        fromMetersPerSecond3 = Velocity.fromMetersPerSecond(fVar.b.a());
                                        powerGoal = new ExercisePerformanceGoal.SpeedGoal(fromMetersPerSecond2, fromMetersPerSecond3);
                                    } else {
                                        if (h4qVar instanceof h4q.b) {
                                            h4q.b bVar2 = (h4q.b) h4qVar;
                                            it = it2;
                                            powerGoal = new ExercisePerformanceGoal.CadenceGoal(bVar2.a, bVar2.b);
                                        } else {
                                            it = it2;
                                            if (h4qVar instanceof h4q.c) {
                                                h4q.c cVar = (h4q.c) h4qVar;
                                                powerGoal = new ExercisePerformanceGoal.HeartRateGoal(an10.a(cVar.a), an10.a(cVar.b));
                                            } else if (h4qVar instanceof h4q.h) {
                                                powerGoal = new ExercisePerformanceGoal.WeightGoal(u3q0.d(((h4q.h) h4qVar).a));
                                            } else if (h4qVar instanceof h4q.e) {
                                                powerGoal = new ExercisePerformanceGoal.RateOfPerceivedExertionGoal(((h4q.e) h4qVar).a);
                                            } else if (h4qVar instanceof h4q.a) {
                                                powerGoal = ExercisePerformanceGoal.AmrapGoal.INSTANCE;
                                            } else {
                                                if (!(h4qVar instanceof h4q.g)) {
                                                    throw new IllegalArgumentException("Unsupported exercise performance target " + h4qVar);
                                                }
                                                powerGoal = ExercisePerformanceGoal.UnknownGoal.INSTANCE;
                                            }
                                        }
                                        arrayList6.add(powerGoal);
                                        it2 = it;
                                    }
                                    it = it2;
                                    arrayList6.add(powerGoal);
                                    it2 = it;
                                }
                                builder3.setPerformanceGoals(arrayList6);
                                arrayList4.add(builder3.build());
                                i = 10;
                            }
                            builder2.setSteps(arrayList4);
                            arrayList2.add(builder2.build());
                            i = 10;
                        }
                        builder.setBlocks(arrayList2);
                        plannedExerciseSessionRecord = builder.build();
                    } else if (zef0Var instanceof fzj0) {
                        fzj0 fzj0Var = (fzj0) zef0Var;
                        SkinTemperatureRecord.Builder builder4 = new SkinTemperatureRecord.Builder(mi20.a(fzj0Var.e), fzj0Var.a, fzj0Var.c);
                        ZoneOffset zoneOffset7 = fzj0Var.b;
                        if (zoneOffset7 != null) {
                            builder4.setStartZoneOffset(zoneOffset7);
                        }
                        ZoneOffset zoneOffset8 = fzj0Var.d;
                        if (zoneOffset8 != null) {
                            builder4.setEndZoneOffset(zoneOffset8);
                        }
                        c8o0 c8o0Var = fzj0Var.g;
                        if (c8o0Var != null) {
                            fromCelsius3 = Temperature.fromCelsius(c8o0Var.a());
                            builder4.setBaseline(fromCelsius3);
                        }
                        Integer num5 = (Integer) v8x.w.get(Integer.valueOf(fzj0Var.h));
                        builder4.setMeasurementLocation(num5 != null ? num5.intValue() : 0);
                        List<fzj0.d> list = fzj0Var.f;
                        ArrayList arrayList7 = new ArrayList(c5g.u(list, 10));
                        for (fzj0.d dVar2 : list) {
                            arrayList7.add(new SkinTemperatureRecord.Delta(TemperatureDelta.fromCelsius(dVar2.b.a()), dVar2.a));
                        }
                        builder4.setDeltas(arrayList7);
                        plannedExerciseSessionRecord = builder4.build();
                    }
                }
                if (plannedExerciseSessionRecord == null) {
                    if (zef0Var instanceof f80) {
                        f80 f80Var = (f80) zef0Var;
                        Metadata a4 = mi20.a(f80Var.f);
                        Instant instant7 = f80Var.a;
                        Instant instant8 = f80Var.c;
                        fromCalories = Energy.fromCalories(f80Var.e.a());
                        ActiveCaloriesBurnedRecord.Builder builder5 = new ActiveCaloriesBurnedRecord.Builder(a4, instant7, instant8, fromCalories);
                        ZoneOffset zoneOffset9 = f80Var.b;
                        if (zoneOffset9 != null) {
                            builder5.setStartZoneOffset(zoneOffset9);
                        }
                        ZoneOffset zoneOffset10 = f80Var.d;
                        if (zoneOffset10 != null) {
                            builder5.setEndZoneOffset(zoneOffset10);
                        }
                        builder5.build();
                        return;
                    }
                    if (zef0Var instanceof e46) {
                        e46 e46Var = (e46) zef0Var;
                        Metadata a5 = mi20.a(e46Var.c);
                        Instant instant9 = e46Var.a;
                        Integer num6 = (Integer) v8x.m.get(Integer.valueOf(e46Var.e));
                        intValue = num6 != null ? num6.intValue() : 0;
                        fromCelsius2 = Temperature.fromCelsius(e46Var.d.a());
                        BasalBodyTemperatureRecord.Builder builder6 = new BasalBodyTemperatureRecord.Builder(a5, instant9, intValue, fromCelsius2);
                        ZoneOffset zoneOffset11 = e46Var.b;
                        if (zoneOffset11 != null) {
                            builder6.setZoneOffset(zoneOffset11);
                        }
                        builder6.build();
                        return;
                    }
                    if (zef0Var instanceof f46) {
                        f46 f46Var = (f46) zef0Var;
                        Metadata a6 = mi20.a(f46Var.d);
                        Instant instant10 = f46Var.a;
                        fromWatts2 = Power.fromWatts(f46Var.c.a());
                        BasalMetabolicRateRecord.Builder builder7 = new BasalMetabolicRateRecord.Builder(a6, instant10, fromWatts2);
                        ZoneOffset zoneOffset12 = f46Var.b;
                        if (zoneOffset12 != null) {
                            builder7.setZoneOffset(zoneOffset12);
                        }
                        builder7.build();
                        return;
                    }
                    if (zef0Var instanceof fg7) {
                        fg7 fg7Var = (fg7) zef0Var;
                        Metadata a7 = mi20.a(fg7Var.c);
                        Instant instant11 = fg7Var.a;
                        Integer num7 = (Integer) v8x.y.get(Integer.valueOf(fg7Var.e));
                        int intValue4 = num7 != null ? num7.intValue() : 0;
                        BloodGlucose fromMillimolesPerLiter = BloodGlucose.fromMillimolesPerLiter(fg7Var.d.a());
                        Integer num8 = (Integer) v8x.A.get(Integer.valueOf(fg7Var.g));
                        int intValue5 = num8 != null ? num8.intValue() : 0;
                        Integer num9 = (Integer) v8x.g.get(Integer.valueOf(fg7Var.f));
                        BloodGlucoseRecord.Builder builder8 = new BloodGlucoseRecord.Builder(a7, instant11, intValue4, fromMillimolesPerLiter, intValue5, num9 != null ? num9.intValue() : 0);
                        ZoneOffset zoneOffset13 = fg7Var.b;
                        if (zoneOffset13 != null) {
                            builder8.setZoneOffset(zoneOffset13);
                        }
                        builder8.build();
                        return;
                    }
                    if (zef0Var instanceof jg7) {
                        jg7 jg7Var = (jg7) zef0Var;
                        Metadata a8 = mi20.a(jg7Var.c);
                        Instant instant12 = jg7Var.a;
                        Integer num10 = (Integer) v8x.o.get(Integer.valueOf(jg7Var.g));
                        int intValue6 = num10 != null ? num10.intValue() : 0;
                        fromMillimetersOfMercury = Pressure.fromMillimetersOfMercury(jg7Var.d.b);
                        fromMillimetersOfMercury2 = Pressure.fromMillimetersOfMercury(jg7Var.e.b);
                        Integer num11 = (Integer) v8x.c.get(Integer.valueOf(jg7Var.f));
                        BloodPressureRecord.Builder builder9 = new BloodPressureRecord.Builder(a8, instant12, intValue6, fromMillimetersOfMercury, fromMillimetersOfMercury2, num11 != null ? num11.intValue() : 0);
                        ZoneOffset zoneOffset14 = jg7Var.b;
                        if (zoneOffset14 != null) {
                            builder9.setZoneOffset(zoneOffset14);
                        }
                        builder9.build();
                        return;
                    }
                    if (zef0Var instanceof oj7) {
                        oj7 oj7Var = (oj7) zef0Var;
                        Metadata a9 = mi20.a(oj7Var.d);
                        Instant instant13 = oj7Var.a;
                        fromValue2 = Percentage.fromValue(oj7Var.c.b);
                        BodyFatRecord.Builder builder10 = new BodyFatRecord.Builder(a9, instant13, fromValue2);
                        ZoneOffset zoneOffset15 = oj7Var.b;
                        if (zoneOffset15 != null) {
                            builder10.setZoneOffset(zoneOffset15);
                        }
                        builder10.build();
                        return;
                    }
                    if (zef0Var instanceof uj7) {
                        uj7 uj7Var = (uj7) zef0Var;
                        Metadata a10 = mi20.a(uj7Var.c);
                        Instant instant14 = uj7Var.a;
                        Integer num12 = (Integer) v8x.m.get(Integer.valueOf(uj7Var.e));
                        intValue = num12 != null ? num12.intValue() : 0;
                        fromCelsius = Temperature.fromCelsius(uj7Var.d.a());
                        BodyTemperatureRecord.Builder builder11 = new BodyTemperatureRecord.Builder(a10, instant14, intValue, fromCelsius);
                        ZoneOffset zoneOffset16 = uj7Var.b;
                        if (zoneOffset16 != null) {
                            builder11.setZoneOffset(zoneOffset16);
                        }
                        builder11.build();
                        return;
                    }
                    if (zef0Var instanceof vj7) {
                        vj7 vj7Var = (vj7) zef0Var;
                        BodyWaterMassRecord.Builder builder12 = new BodyWaterMassRecord.Builder(mi20.a(vj7Var.d), vj7Var.a, u3q0.d(vj7Var.c));
                        ZoneOffset zoneOffset17 = vj7Var.b;
                        if (zoneOffset17 != null) {
                            builder12.setZoneOffset(zoneOffset17);
                        }
                        builder12.build();
                        return;
                    }
                    if (zef0Var instanceof xj7) {
                        xj7 xj7Var = (xj7) zef0Var;
                        BoneMassRecord.Builder builder13 = new BoneMassRecord.Builder(mi20.a(xj7Var.d), xj7Var.a, u3q0.d(xj7Var.c));
                        ZoneOffset zoneOffset18 = xj7Var.b;
                        if (zoneOffset18 != null) {
                            builder13.setZoneOffset(zoneOffset18);
                        }
                        builder13.build();
                        return;
                    }
                    if (zef0Var instanceof nqa) {
                        nqa nqaVar = (nqa) zef0Var;
                        Metadata a11 = mi20.a(nqaVar.c);
                        Instant instant15 = nqaVar.a;
                        Integer num13 = (Integer) v8x.s.get(Integer.valueOf(nqaVar.e));
                        int intValue7 = num13 != null ? num13.intValue() : 0;
                        Integer num14 = (Integer) v8x.a.get(Integer.valueOf(nqaVar.d));
                        CervicalMucusRecord.Builder builder14 = new CervicalMucusRecord.Builder(a11, instant15, intValue7, num14 != null ? num14.intValue() : 0);
                        ZoneOffset zoneOffset19 = nqaVar.b;
                        if (zoneOffset19 != null) {
                            builder14.setZoneOffset(zoneOffset19);
                        }
                        builder14.build();
                        return;
                    }
                    if (zef0Var instanceof dqk) {
                        dqk dqkVar = (dqk) zef0Var;
                        Metadata a12 = mi20.a(dqkVar.f);
                        Instant instant16 = dqkVar.a;
                        Instant instant17 = dqkVar.c;
                        List<dqk.a> list2 = dqkVar.e;
                        ArrayList arrayList8 = new ArrayList(c5g.u(list2, 10));
                        for (dqk.a aVar : list2) {
                            arrayList8.add(new CyclingPedalingCadenceRecord.CyclingPedalingCadenceRecordSample(aVar.b, aVar.a));
                        }
                        CyclingPedalingCadenceRecord.Builder builder15 = new CyclingPedalingCadenceRecord.Builder(a12, instant16, instant17, arrayList8);
                        ZoneOffset zoneOffset20 = dqkVar.b;
                        if (zoneOffset20 != null) {
                            builder15.setStartZoneOffset(zoneOffset20);
                        }
                        ZoneOffset zoneOffset21 = dqkVar.d;
                        if (zoneOffset21 != null) {
                            builder15.setEndZoneOffset(zoneOffset21);
                        }
                        builder15.build();
                        return;
                    }
                    if (zef0Var instanceof bhn) {
                        bhn bhnVar = (bhn) zef0Var;
                        DistanceRecord.Builder builder16 = new DistanceRecord.Builder(mi20.a(bhnVar.f), bhnVar.a, bhnVar.c, u3q0.c(bhnVar.e));
                        ZoneOffset zoneOffset22 = bhnVar.b;
                        if (zoneOffset22 != null) {
                            builder16.setStartZoneOffset(zoneOffset22);
                        }
                        ZoneOffset zoneOffset23 = bhnVar.d;
                        if (zoneOffset23 != null) {
                            builder16.setEndZoneOffset(zoneOffset23);
                        }
                        builder16.build();
                        return;
                    }
                    if (zef0Var instanceof cbp) {
                        cbp cbpVar = (cbp) zef0Var;
                        ElevationGainedRecord.Builder builder17 = new ElevationGainedRecord.Builder(mi20.a(cbpVar.f), cbpVar.a, cbpVar.c, u3q0.c(cbpVar.e));
                        ZoneOffset zoneOffset24 = cbpVar.b;
                        if (zoneOffset24 != null) {
                            builder17.setStartZoneOffset(zoneOffset24);
                        }
                        ZoneOffset zoneOffset25 = cbpVar.d;
                        if (zoneOffset25 != null) {
                            builder17.setEndZoneOffset(zoneOffset25);
                        }
                        builder17.build();
                        return;
                    }
                    if (zef0Var instanceof n4q) {
                        n4q n4qVar = (n4q) zef0Var;
                        ExerciseSessionRecord.Builder builder18 = new ExerciseSessionRecord.Builder(mi20.a(n4qVar.e), n4qVar.a, n4qVar.c, v8x.b(n4qVar.f));
                        ZoneOffset zoneOffset26 = n4qVar.b;
                        if (zoneOffset26 != null) {
                            builder18.setStartZoneOffset(zoneOffset26);
                        }
                        ZoneOffset zoneOffset27 = n4qVar.d;
                        if (zoneOffset27 != null) {
                            builder18.setEndZoneOffset(zoneOffset27);
                        }
                        String str5 = n4qVar.h;
                        if (str5 != null) {
                            builder18.setNotes(str5);
                        }
                        String str6 = n4qVar.g;
                        if (str6 != null) {
                            builder18.setTitle(str6);
                        }
                        List<g4q> list3 = n4qVar.j;
                        ArrayList arrayList9 = new ArrayList(c5g.u(list3, 10));
                        for (g4q g4qVar : list3) {
                            ExerciseLap.Builder builder19 = new ExerciseLap.Builder(g4qVar.a, g4qVar.b);
                            c2z c2zVar = g4qVar.c;
                            if (c2zVar != null) {
                                builder19.setLength(u3q0.c(c2zVar));
                            }
                            arrayList9.add(builder19.build());
                        }
                        builder18.setLaps(arrayList9);
                        List<l4q> list4 = n4qVar.i;
                        ArrayList arrayList10 = new ArrayList(c5g.u(list4, 10));
                        for (l4q l4qVar : list4) {
                            Instant instant18 = l4qVar.a;
                            Instant instant19 = l4qVar.b;
                            Integer num15 = (Integer) v8x.G.get(Integer.valueOf(l4qVar.c));
                            arrayList10.add(new ExerciseSegment.Builder(instant18, instant19, num15 != null ? num15.intValue() : 0).setRepetitionsCount(l4qVar.d).build());
                        }
                        builder18.setSegments(arrayList10);
                        k4q k4qVar = n4qVar.k;
                        if (k4qVar instanceof k4q.b) {
                            ArrayList<i4q.a> arrayList11 = ((k4q.b) k4qVar).a.a;
                            ArrayList arrayList12 = new ArrayList(c5g.u(arrayList11, 10));
                            for (i4q.a aVar2 : arrayList11) {
                                ExerciseRoute.Location.Builder builder20 = new ExerciseRoute.Location.Builder(aVar2.a, aVar2.b, aVar2.c);
                                c2z c2zVar2 = aVar2.d;
                                if (c2zVar2 != null) {
                                    builder20.setHorizontalAccuracy(u3q0.c(c2zVar2));
                                }
                                c2z c2zVar3 = aVar2.e;
                                if (c2zVar3 != null) {
                                    builder20.setVerticalAccuracy(u3q0.c(c2zVar3));
                                }
                                c2z c2zVar4 = aVar2.f;
                                if (c2zVar4 != null) {
                                    builder20.setAltitude(u3q0.c(c2zVar4));
                                }
                                arrayList12.add(builder20.build());
                            }
                            builder18.setRoute(new ExerciseRoute(arrayList12));
                        }
                        String str7 = n4qVar.l;
                        if (str7 != null) {
                            builder18.setPlannedExerciseSessionId(str7);
                        }
                        builder18.build();
                        return;
                    }
                    if (zef0Var instanceof jsr) {
                        jsr jsrVar = (jsr) zef0Var;
                        FloorsClimbedRecord.Builder builder21 = new FloorsClimbedRecord.Builder(mi20.a(jsrVar.f), jsrVar.a, jsrVar.c, jsrVar.e);
                        ZoneOffset zoneOffset28 = jsrVar.b;
                        if (zoneOffset28 != null) {
                            builder21.setStartZoneOffset(zoneOffset28);
                        }
                        ZoneOffset zoneOffset29 = jsrVar.d;
                        if (zoneOffset29 != null) {
                            builder21.setEndZoneOffset(zoneOffset29);
                        }
                        builder21.build();
                        return;
                    }
                    if (zef0Var instanceof k1v) {
                        k1v k1vVar = (k1v) zef0Var;
                        Metadata a13 = mi20.a(k1vVar.f);
                        Instant instant20 = k1vVar.a;
                        Instant instant21 = k1vVar.c;
                        List<k1v.a> list5 = k1vVar.e;
                        ArrayList arrayList13 = new ArrayList(c5g.u(list5, 10));
                        for (k1v.a aVar3 : list5) {
                            arrayList13.add(new HeartRateRecord.HeartRateSample(aVar3.b, aVar3.a));
                        }
                        HeartRateRecord.Builder builder22 = new HeartRateRecord.Builder(a13, instant20, instant21, arrayList13);
                        ZoneOffset zoneOffset30 = k1vVar.b;
                        if (zoneOffset30 != null) {
                            builder22.setStartZoneOffset(zoneOffset30);
                        }
                        ZoneOffset zoneOffset31 = k1vVar.d;
                        if (zoneOffset31 != null) {
                            builder22.setEndZoneOffset(zoneOffset31);
                        }
                        builder22.build();
                        return;
                    }
                    if (zef0Var instanceof l1v) {
                        l1v l1vVar = (l1v) zef0Var;
                        HeartRateVariabilityRmssdRecord.Builder builder23 = new HeartRateVariabilityRmssdRecord.Builder(mi20.a(l1vVar.d), l1vVar.a, l1vVar.c);
                        ZoneOffset zoneOffset32 = l1vVar.b;
                        if (zoneOffset32 != null) {
                            builder23.setZoneOffset(zoneOffset32);
                        }
                        builder23.build();
                        return;
                    }
                    if (zef0Var instanceof x1v) {
                        x1v x1vVar = (x1v) zef0Var;
                        q91.j();
                        HeightRecord.Builder c = p91.c(mi20.a(x1vVar.d), x1vVar.a, u3q0.c(x1vVar.c));
                        ZoneOffset zoneOffset33 = x1vVar.b;
                        if (zoneOffset33 != null) {
                            c.setZoneOffset(zoneOffset33);
                        }
                        c.build();
                        return;
                    }
                    if (zef0Var instanceof olv) {
                        olv olvVar = (olv) zef0Var;
                        a91.j();
                        Metadata a14 = mi20.a(olvVar.f);
                        Instant instant22 = olvVar.a;
                        Instant instant23 = olvVar.c;
                        fromLiters = Volume.fromLiters(olvVar.e.a());
                        HydrationRecord.Builder d = z81.d(a14, instant22, instant23, fromLiters);
                        ZoneOffset zoneOffset34 = olvVar.b;
                        if (zoneOffset34 != null) {
                            d.setStartZoneOffset(zoneOffset34);
                        }
                        ZoneOffset zoneOffset35 = olvVar.d;
                        if (zoneOffset35 != null) {
                            d.setEndZoneOffset(zoneOffset35);
                        }
                        d.build();
                        return;
                    }
                    if (zef0Var instanceof nfx) {
                        nfx nfxVar = (nfx) zef0Var;
                        c81.g();
                        IntermenstrualBleedingRecord.Builder d2 = b81.d(mi20.a(nfxVar.c), nfxVar.a);
                        ZoneOffset zoneOffset36 = nfxVar.b;
                        if (zoneOffset36 != null) {
                            d2.setZoneOffset(zoneOffset36);
                        }
                        d2.build();
                        return;
                    }
                    if (zef0Var instanceof bzy) {
                        bzy bzyVar = (bzy) zef0Var;
                        d92.f();
                        LeanBodyMassRecord.Builder b2 = v91.b(mi20.a(bzyVar.d), bzyVar.a, u3q0.d(bzyVar.c));
                        ZoneOffset zoneOffset37 = bzyVar.b;
                        if (zoneOffset37 != null) {
                            b2.setZoneOffset(zoneOffset37);
                        }
                        b2.build();
                        return;
                    }
                    if (zef0Var instanceof i320) {
                        i320 i320Var = (i320) zef0Var;
                        h81.j();
                        Metadata a15 = mi20.a(i320Var.c);
                        Instant instant24 = i320Var.a;
                        Integer num16 = (Integer) v8x.k.get(Integer.valueOf(i320Var.d));
                        MenstruationFlowRecord.Builder e = g81.e(a15, instant24, num16 != null ? num16.intValue() : 0);
                        ZoneOffset zoneOffset38 = i320Var.b;
                        if (zoneOffset38 != null) {
                            e.setZoneOffset(zoneOffset38);
                        }
                        e.build();
                        return;
                    }
                    if (zef0Var instanceof j320) {
                        j320 j320Var = (j320) zef0Var;
                        e81.j();
                        MenstruationPeriodRecord.Builder d3 = d81.d(mi20.a(j320Var.e), j320Var.a, j320Var.c);
                        ZoneOffset zoneOffset39 = j320Var.b;
                        if (zoneOffset39 != null) {
                            d3.setStartZoneOffset(zoneOffset39);
                        }
                        ZoneOffset zoneOffset40 = j320Var.d;
                        if (zoneOffset40 != null) {
                            d3.setEndZoneOffset(zoneOffset40);
                        }
                        d3.build();
                        return;
                    }
                    if (zef0Var instanceof yn70) {
                        a((yn70) zef0Var);
                        return;
                    }
                    if (zef0Var instanceof i490) {
                        i490 i490Var = (i490) zef0Var;
                        vw6.l();
                        Metadata a16 = mi20.a(i490Var.d);
                        Instant instant25 = i490Var.a;
                        Integer num17 = (Integer) v8x.q.get(Integer.valueOf(i490Var.c));
                        OvulationTestRecord.Builder f = x81.f(a16, instant25, num17 != null ? num17.intValue() : 0);
                        ZoneOffset zoneOffset41 = i490Var.b;
                        if (zoneOffset41 != null) {
                            f.setZoneOffset(zoneOffset41);
                        }
                        f.build();
                        return;
                    }
                    if (zef0Var instanceof f690) {
                        f690 f690Var = (f690) zef0Var;
                        h91.i();
                        Metadata a17 = mi20.a(f690Var.d);
                        Instant instant26 = f690Var.a;
                        fromValue = Percentage.fromValue(f690Var.c.b);
                        OxygenSaturationRecord.Builder d4 = g91.d(a17, instant26, fromValue);
                        ZoneOffset zoneOffset42 = f690Var.b;
                        if (zoneOffset42 != null) {
                            d4.setZoneOffset(zoneOffset42);
                        }
                        d4.build();
                        return;
                    }
                    if (zef0Var instanceof vwc0) {
                        vwc0 vwc0Var = (vwc0) zef0Var;
                        Metadata a18 = mi20.a(vwc0Var.f);
                        Instant instant27 = vwc0Var.a;
                        Instant instant28 = vwc0Var.c;
                        List<vwc0.d> list6 = vwc0Var.e;
                        ArrayList arrayList14 = new ArrayList(c5g.u(list6, 10));
                        for (vwc0.d dVar3 : list6) {
                            i92.d();
                            fromWatts = Power.fromWatts(dVar3.b.a());
                            arrayList14.add(h92.d(fromWatts, dVar3.a));
                        }
                        PowerRecord.Builder d5 = sa1.d(a18, instant27, instant28, arrayList14);
                        ZoneOffset zoneOffset43 = vwc0Var.b;
                        if (zoneOffset43 != null) {
                            d5.setStartZoneOffset(zoneOffset43);
                        }
                        ZoneOffset zoneOffset44 = vwc0Var.d;
                        if (zoneOffset44 != null) {
                            d5.setEndZoneOffset(zoneOffset44);
                        }
                        d5.build();
                        return;
                    }
                    if (zef0Var instanceof ibg0) {
                        ibg0 ibg0Var = (ibg0) zef0Var;
                        z91.h();
                        RespiratoryRateRecord.Builder b3 = y91.b(mi20.a(ibg0Var.d), ibg0Var.a, ibg0Var.c);
                        ZoneOffset zoneOffset45 = ibg0Var.b;
                        if (zoneOffset45 != null) {
                            b3.setZoneOffset(zoneOffset45);
                        }
                        b3.build();
                        return;
                    }
                    if (zef0Var instanceof vbg0) {
                        vbg0 vbg0Var = (vbg0) zef0Var;
                        fa1.h();
                        RestingHeartRateRecord.Builder c2 = ea1.c(mi20.a(vbg0Var.d), vbg0Var.a, vbg0Var.c);
                        ZoneOffset zoneOffset46 = vbg0Var.b;
                        if (zoneOffset46 != null) {
                            c2.setZoneOffset(zoneOffset46);
                        }
                        c2.build();
                        return;
                    }
                    if (zef0Var instanceof e4j0) {
                        e4j0 e4j0Var = (e4j0) zef0Var;
                        w81.i();
                        Metadata a19 = mi20.a(e4j0Var.c);
                        Instant instant29 = e4j0Var.a;
                        Integer num18 = (Integer) v8x.u.get(Integer.valueOf(e4j0Var.d));
                        SexualActivityRecord.Builder d6 = v81.d(a19, instant29, num18 != null ? num18.intValue() : 0);
                        ZoneOffset zoneOffset47 = e4j0Var.b;
                        if (zoneOffset47 != null) {
                            d6.setZoneOffset(zoneOffset47);
                        }
                        d6.build();
                        return;
                    }
                    if (zef0Var instanceof uzj0) {
                        uzj0 uzj0Var = (uzj0) zef0Var;
                        z92.e();
                        SleepSessionRecord.Builder d7 = z71.d(mi20.a(uzj0Var.e), uzj0Var.a, uzj0Var.c);
                        ZoneOffset zoneOffset48 = uzj0Var.b;
                        if (zoneOffset48 != null) {
                            d7.setStartZoneOffset(zoneOffset48);
                        }
                        ZoneOffset zoneOffset49 = uzj0Var.d;
                        if (zoneOffset49 != null) {
                            d7.setEndZoneOffset(zoneOffset49);
                        }
                        String str8 = uzj0Var.g;
                        if (str8 != null) {
                            d7.setNotes(str8);
                        }
                        String str9 = uzj0Var.f;
                        if (str9 != null) {
                            d7.setTitle(str9);
                        }
                        List<uzj0.a> list7 = uzj0Var.h;
                        ArrayList arrayList15 = new ArrayList(c5g.u(list7, 10));
                        for (uzj0.a aVar4 : list7) {
                            eb1.h();
                            Instant instant30 = aVar4.a;
                            Instant instant31 = aVar4.b;
                            Integer num19 = (Integer) v8x.E.get(Integer.valueOf(aVar4.c));
                            arrayList15.add(p92.e(instant30, instant31, num19 != null ? num19.intValue() : 0));
                        }
                        d7.setStages(arrayList15);
                        d7.build();
                        return;
                    }
                    if (zef0Var instanceof gkk0) {
                        gkk0 gkk0Var = (gkk0) zef0Var;
                        Metadata a20 = mi20.a(gkk0Var.f);
                        Instant instant32 = gkk0Var.a;
                        Instant instant33 = gkk0Var.c;
                        List<gkk0.d> list8 = gkk0Var.e;
                        ArrayList arrayList16 = new ArrayList(c5g.u(list8, 10));
                        for (gkk0.d dVar4 : list8) {
                            g92.f();
                            fromMetersPerSecond = Velocity.fromMetersPerSecond(dVar4.b.a());
                            arrayList16.add(oa1.b(fromMetersPerSecond, dVar4.a));
                        }
                        SpeedRecord.Builder d8 = b52.d(a20, instant32, instant33, arrayList16);
                        ZoneOffset zoneOffset50 = gkk0Var.b;
                        if (zoneOffset50 != null) {
                            d8.setStartZoneOffset(zoneOffset50);
                        }
                        ZoneOffset zoneOffset51 = gkk0Var.d;
                        if (zoneOffset51 != null) {
                            d8.setEndZoneOffset(zoneOffset51);
                        }
                        d8.build();
                        return;
                    }
                    if (zef0Var instanceof r0l0) {
                        r0l0 r0l0Var = (r0l0) zef0Var;
                        Metadata a21 = mi20.a(r0l0Var.f);
                        Instant instant34 = r0l0Var.a;
                        Instant instant35 = r0l0Var.c;
                        List<r0l0.a> list9 = r0l0Var.e;
                        ArrayList arrayList17 = new ArrayList(c5g.u(list9, 10));
                        for (r0l0.a aVar5 : list9) {
                            l92.h();
                            arrayList17.add(k92.c(aVar5.b, aVar5.a));
                        }
                        StepsCadenceRecord.Builder b4 = y92.b(a21, instant34, instant35, arrayList17);
                        ZoneOffset zoneOffset52 = r0l0Var.b;
                        if (zoneOffset52 != null) {
                            b4.setStartZoneOffset(zoneOffset52);
                        }
                        ZoneOffset zoneOffset53 = r0l0Var.d;
                        if (zoneOffset53 != null) {
                            b4.setEndZoneOffset(zoneOffset53);
                        }
                        b4.build();
                        return;
                    }
                    if (zef0Var instanceof x0l0) {
                        x0l0 x0l0Var = (x0l0) zef0Var;
                        f91.j();
                        StepsRecord.Builder e2 = e91.e(mi20.a(x0l0Var.f), x0l0Var.a, x0l0Var.c, x0l0Var.e);
                        ZoneOffset zoneOffset54 = x0l0Var.b;
                        if (zoneOffset54 != null) {
                            e2.setStartZoneOffset(zoneOffset54);
                        }
                        ZoneOffset zoneOffset55 = x0l0Var.d;
                        if (zoneOffset55 != null) {
                            e2.setEndZoneOffset(zoneOffset55);
                        }
                        e2.build();
                        return;
                    }
                    if (zef0Var instanceof zcp0) {
                        c((zcp0) zef0Var);
                        return;
                    }
                    if (zef0Var instanceof qbw0) {
                        d((qbw0) zef0Var);
                        return;
                    }
                    if (zef0Var instanceof jkx0) {
                        e((jkx0) zef0Var);
                    } else {
                        if (!(zef0Var instanceof qkx0)) {
                            throw new IllegalArgumentException("Unsupported record " + zef0Var);
                        }
                        f((qkx0) zef0Var);
                    }
                }
            }
        }
    }

    public static final TotalCaloriesBurnedRecord c(zcp0 zcp0Var) {
        Energy fromCalories;
        TotalCaloriesBurnedRecord build;
        f92.g();
        Metadata a = mi20.a(zcp0Var.f);
        Instant instant = zcp0Var.a;
        Instant instant2 = zcp0Var.c;
        fromCalories = Energy.fromCalories(zcp0Var.e.a());
        TotalCaloriesBurnedRecord.Builder c = e92.c(a, instant, instant2, fromCalories);
        ZoneOffset zoneOffset = zcp0Var.b;
        if (zoneOffset != null) {
            c.setStartZoneOffset(zoneOffset);
        }
        ZoneOffset zoneOffset2 = zcp0Var.d;
        if (zoneOffset2 != null) {
            c.setEndZoneOffset(zoneOffset2);
        }
        build = c.build();
        return build;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, java.util.Map] */
    public static final Vo2MaxRecord d(qbw0 qbw0Var) {
        Vo2MaxRecord build;
        r81.h();
        Metadata a = mi20.a(qbw0Var.c);
        Instant instant = qbw0Var.a;
        Integer num = (Integer) v8x.i.get(Integer.valueOf(qbw0Var.e));
        Vo2MaxRecord.Builder e = p81.e(a, instant, num != null ? num.intValue() : 0, qbw0Var.d);
        ZoneOffset zoneOffset = qbw0Var.b;
        if (zoneOffset != null) {
            e.setZoneOffset(zoneOffset);
        }
        build = e.build();
        return build;
    }

    public static final WeightRecord e(jkx0 jkx0Var) {
        Mass fromGrams;
        WeightRecord build;
        q92.g();
        Metadata a = mi20.a(jkx0Var.d);
        Instant instant = jkx0Var.a;
        fromGrams = Mass.fromGrams(jkx0Var.c.a());
        WeightRecord.Builder e = hb1.e(a, instant, fromGrams);
        ZoneOffset zoneOffset = jkx0Var.b;
        if (zoneOffset != null) {
            e.setZoneOffset(zoneOffset);
        }
        build = e.build();
        return build;
    }

    public static final WheelchairPushesRecord f(qkx0 qkx0Var) {
        WheelchairPushesRecord build;
        u91.j();
        WheelchairPushesRecord.Builder d = t91.d(mi20.a(qkx0Var.f), qkx0Var.a, qkx0Var.c, qkx0Var.e);
        ZoneOffset zoneOffset = qkx0Var.b;
        if (zoneOffset != null) {
            d.setStartZoneOffset(zoneOffset);
        }
        ZoneOffset zoneOffset2 = qkx0Var.d;
        if (zoneOffset2 != null) {
            d.setEndZoneOffset(zoneOffset2);
        }
        build = d.build();
        return build;
    }
}
